package com.samsoeed.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.springframework.data.annotation.Id
import java.time.LocalDateTime
import jakarta.persistence.Column

@Entity
data class Booking(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column
    val customerId: UInt,

    @Column
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column
    val combinationId : MutableList<UInt>,

    @Column
    val state: State
)
{

    fun addBakery(bakeryIds : MutableList<UInt>) {
        combinationId.addAll(bakeryIds)
    }

    fun getCombinationsId() : MutableList<UInt> {
        return combinationId
    }
}
