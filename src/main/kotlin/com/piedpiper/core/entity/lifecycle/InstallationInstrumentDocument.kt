package com.piedpiper.core.entity.lifecycle

import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "installation_instrument_doc")
@Entity(name = "installation_instrument_doc")
// происходит доставка УЭЛН на локационную базу (специалисты заносят информацию в MDM или отмечают приход).
// УЭЛН находится на «складе» в резерве;
class InstallationInstrumentDocument : BaseDocumentInfo() {

    @Transient
    override val documentName: String = "Доставка на базу"
}