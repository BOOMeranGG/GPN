package com.piedpiper.core.service

import com.piedpiper.core.dto.response.InstrumentData
import com.piedpiper.core.dto.response.InstrumentOnWellResponse
import com.piedpiper.core.dto.response.LifecycleData
import com.piedpiper.core.dto.response.OutsideInstrumentsResponse
import com.piedpiper.core.dto.response.WellData
import com.piedpiper.core.entity.Instrument
import com.piedpiper.core.entity.lifecycle.BaseDocument
import com.piedpiper.core.repository.BaseDocumentRepository
import com.piedpiper.core.repository.InstrumentRepository
import com.piedpiper.core.repository.WellsRepository
import org.springframework.stereotype.Service

@Service
class InstrumentService(
    private val wellsRepository: WellsRepository,
    private val baseDocumentRepository: BaseDocumentRepository,
    private val instrumentRepository: InstrumentRepository
) {

    val outsideTypes = listOf("Выпущено", "Доставка на базу", "Необходимо подготовить", "Ремонт/списание")

    fun getOutsideInstruments(): OutsideInstrumentsResponse {
        val baseDocuments = baseDocumentRepository.findAllByDocumentTypes(outsideTypes)
        val instruments = baseDocuments.groupBy { it.instrument }

        val instrumentData = createInstrumentDataList(instruments)

        return OutsideInstrumentsResponse(instruments = instrumentData)
    }

    fun getWellsInstruments(): InstrumentOnWellResponse? {
        val wells = wellsRepository.findAll()
        val instruments = wells.flatMap { it.instruments }
        val instrumentsWellsMap = instruments.groupBy { it.well!! }

        val wellsResult = mutableListOf<WellData>()
        instrumentsWellsMap.forEach { (well, instruments) ->
            val baseDocuments = instruments.flatMap { it.documents }
            val instrumentsMap = baseDocuments.groupBy { it.instrument }

            wellsResult.add(WellData(
                id = well.id,
                mineralDepositName = well.mineralDepositName,
                number = well.number,
                state = well.state,
                instruments = createInstrumentDataList(instrumentsMap)
            ))
        }

        return InstrumentOnWellResponse(
            wells = wellsResult
        )
    }

    private fun createInstrumentDataList(instruments: Map<Instrument?, List<BaseDocument>>): List<InstrumentData> {
        val instrumentData = mutableListOf<InstrumentData>()
        instruments.forEach { (k, v) ->
            if (k != null) {
                instrumentData.add(
                    InstrumentData(
                        id = k.id,
                        contractor = k.contractor,
                        equipment = k.equipment,
                        hardwareParameters = k.hardwareParameters,
                        lifecycles = v.map { doc ->
                            LifecycleData(name = doc.documentType, createdAt = doc.createTs)
                        }.sortedBy { d -> d.createdAt },
                        status = v.maxByOrNull { doc -> doc.createTs }!!.documentType,
                        name = k.instrumentName
                    )
                )
            }
        }

        return instrumentData
    }
}
