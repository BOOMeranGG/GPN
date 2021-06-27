package com.piedpiper.core.service

import com.piedpiper.core.dto.request.WellsRequest
import com.piedpiper.core.entity.Wells
import com.piedpiper.core.repository.WellsRepository
import org.springframework.stereotype.Service

@Service
class WellsService(
    private val wellsRepository: WellsRepository
) {

    fun createWell(request: WellsRequest) {
        wellsRepository.save(
            Wells().also {
                it.mineralDepositName = request.mineralDepositName
                it.number = request.number
                it.state = request.state
            }
        )
    }
}