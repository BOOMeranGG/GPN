package com.piedpiper.core.entity

import com.piedpiper.core.entity.lifecycle.BaseDocument
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Table(name = "instrument")
@Entity(name = "instrument")
class Instrument : BaseEntity() {

    @OneToMany(mappedBy = "instrument")
    var documents: List<BaseDocument> = listOf()

    @ManyToOne
    @JoinColumn(name = "well_id")
    var well: Wells? = null

    @Column(name = "contractor")
    var contractor: String = ""

    // Комплектация
    @Column(name = "equipment")
    var equipment: String = ""

    @Column(name = "instrument_name")
    var instrumentName: String = ""

    @Column(name = "hardware_parameters")
    var hardwareParameters: String = ""
}