package com.piedpiper.core.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@Table(name = "wells")
@Entity(name = "wells")
class Wells : BaseEntity() {

    @OneToMany(mappedBy = "well")
    var instruments: List<Instrument> = listOf()

    @Column(name = "mineral_deposit_name")
    var mineralDepositName: String = ""

    @Column(name = "number")
    var number: String = ""

    @Column(name = "state")
    var state: String = ""
}