package com.piedpiper.core.entity.lifecycle

import com.piedpiper.core.entity.lifecycle.BaseDocument
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "instrument_repair_doc")
@Entity(name = "instrument_repair_doc")
// Производится ремонт УЭЛН или списание (в зависимости от износа) (специалисты заносят информацию в MDM);
class InstrumentRepairDocument : BaseDocumentInfo() {

    @Transient
    override val documentName: String = "Ремонт/списание"
}