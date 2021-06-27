package com.piedpiper.core.repository

import com.piedpiper.core.entity.lifecycle.BaseDocument
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface BaseDocumentRepository : JpaRepository<BaseDocument, String> {

    @Query("SELECT d FROM base_doc d WHERE d.documentType IN ?1")
    fun findAllByDocumentTypes(documentTypes: List<String>): List<BaseDocument>
}