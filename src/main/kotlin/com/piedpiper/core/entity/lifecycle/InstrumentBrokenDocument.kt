package com.piedpiper.core.entity.lifecycle

import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "instrument_broken_doc")
@Entity(name = "instrument_broken_doc")
// Происходит выход из строя УЭЛН (отказ), возникает необходимость замены(специалисты заносят информацию в MDM);
class InstrumentBrokenDocument : BaseDocumentInfo() {

    @Transient
    override val documentName: String = "Выход из строя"
}