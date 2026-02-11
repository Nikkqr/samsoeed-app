package com.samsoeed.entities

import java.time.LocalDateTime

data class Booking(val id: Int, val customerName: String) {

    val createdAt: LocalDateTime = LocalDateTime.now()

    private var basket: MutableList<Bakery> = mutableListOf()

    constructor(id: Int, customerName: String, basket: MutableList<Bakery>) : this(id, customerName) {
        this.basket = basket
    }

    fun addBakery(vararg bakery : Bakery) {
        for(i in bakery) {
            basket.add(i)
        }
    }
}
