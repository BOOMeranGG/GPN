package com.piedpiper.core.repository

import com.piedpiper.core.entity.Instrument
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InstrumentRepository : JpaRepository<Instrument, String> {
}