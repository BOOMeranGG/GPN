package com.piedpiper.core.entity.lifecycle

import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "creation_instrument_doc")
@Entity(name = "creation_instrument_doc")
// выпуск на заводе изготовителе
class CreationInstrumentDocument : BaseDocumentInfo() {

    @Transient
    override val documentName: String = "Выпущено"
}