package com.samsoeed.entities

import java.time.LocalDateTime

data class Booking(val id: Int, val customer: User) {

    val createdAt: LocalDateTime = LocalDateTime.now()

    private var basket: MutableList<Bakery> = mutableListOf()

    constructor(id: Int, customer: User, basket: MutableList<Bakery>) : this(id, customer) {
        this.basket = basket
    }

    fun addBakery(vararg bakery : Bakery) {
        for(i in bakery) {
            basket.add(i)
        }
    }

    fun getBasket() : MutableList<Bakery> {
        return basket
    }
}
