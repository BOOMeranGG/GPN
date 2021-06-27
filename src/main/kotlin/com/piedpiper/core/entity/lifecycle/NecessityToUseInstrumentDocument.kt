package com.piedpiper.core.entity.lifecycle

import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "necessity_instrument_doc")
@Entity(name = "necessity_instrument_doc")
// Появляется потребность в УЭЛН (пробурена новая скважина или произошел отказ на старой скважине и нужен новый насос);
class NecessityToUseInstrumentDocument : BaseDocumentInfo() {

    @Transient
    override val documentName: String = "Необходимо подготовить"
}