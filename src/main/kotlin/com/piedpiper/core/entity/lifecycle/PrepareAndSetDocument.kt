package com.piedpiper.core.entity.lifecycle

import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "prepare_and_set_doc")
@Entity(name = "prepare_and_set_doc")
// Производится технологический расчет и УЭЛН отправляется на монтаж/монтируется(специалисты заносят информацию в MDM);
class PrepareAndSetDocument : BaseDocumentInfo() {

    @Transient
    override val documentName: String = "Технологический расчёт и монтаж"
}