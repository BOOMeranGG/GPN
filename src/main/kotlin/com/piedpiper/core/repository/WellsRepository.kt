package com.piedpiper.core.repository

import com.piedpiper.core.entity.Wells
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WellsRepository : JpaRepository<Wells, String> {
}