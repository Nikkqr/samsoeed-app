package com.samsoeed.entities

class Cada (id: Int,
            price: Int,
            quantity: Int,
            filling: List<BakingFilling>): Bakery(id, price, quantity, filling) {
}