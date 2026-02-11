package com.samsoeed.entities

import jakarta.persistence.Entity

@Entity
class Anthill(id: Int,
            price: Int,
            quantity: Int,
            filling: List<BakingFilling>): Bakery(id, price, quantity, filling) {
}