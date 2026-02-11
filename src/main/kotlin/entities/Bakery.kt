package com.samsoeed.entities

import jakarta.persistence.*

@Entity
abstract class Bakery(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val price: Int,

    @Column(nullable = false)
    val quantity: Int,

    @Column(nullable = false)
    @ElementCollection(targetClass = BakingFilling::class)
    var filling: List<BakingFilling>
)