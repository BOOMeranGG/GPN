package com.piedpiper.core.entity.lifecycle

import com.piedpiper.core.entity.BaseEntity
import com.piedpiper.core.entity.Instrument
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Inheritance
import javax.persistence.InheritanceType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Table(name = "base_doc")
@Entity(name = "base_doc")
class BaseDocument : BaseDocumentInfo() {

    @ManyToOne
    @JoinColumn(name = "instrument_id")
    var instrument: Instrument? = null

    @Column(name = "document_id")
    var documentId: String = ""

    @Column(name = "document_type")
    var documentType: String = ""

    override val documentName: String
        get() = ""
}

abstract class BaseDocumentInfo : BaseEntity() {

    abstract val documentName: String
}