package com.samsoeed.entities

import jakarta.persistence.*

@Entity
data class BakeryCombination(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int,

    @Column(nullable = false)
    val bakeryName : BakeryType,

    @Column(nullable = false)
    var quantity : Int,

    @ElementCollection(targetClass = BakingFilling::class)
    @Enumerated(EnumType.STRING)
    val filling : List<BakingFilling>) {
}
