package com.piedpiper.core.entity.lifecycle

import com.piedpiper.core.entity.lifecycle.BaseDocument
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "instrument_dismantling_doc")
@Entity(name = "instrument_dismantling_doc")
// Производится демонтаж УЭЛН из скважины и отправка на локационную базу(специалисты заносят информацию в MDM);
class InstrumentDismantlingDocument : BaseDocumentInfo() {

    @Transient
    override val documentName: String = "Демонтаж"
}