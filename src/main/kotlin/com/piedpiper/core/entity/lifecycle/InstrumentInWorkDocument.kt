package com.piedpiper.core.entity.lifecycle

import com.piedpiper.core.entity.lifecycle.BaseDocument
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "instrument_in_work_doc")
@Entity(name = "instrument_in_work_doc")
// УЭЛН находится в работе(сутки, месяц, год и т.д.) (специалисты заносят информацию в MDM);
class InstrumentInWorkDocument : BaseDocumentInfo() {

    @Transient
    override val documentName: String = "В работе"
}