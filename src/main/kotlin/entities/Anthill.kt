package com.samsoeed.entities

import jakarta.persistence.Entity
import org.w3c.dom.Entity

@Entity
class Anthill(id: Int,
            price: Int,
            quantity: Int,
            filling: List<BakingFilling>): Bakery(id, price, quantity, filling) {
}