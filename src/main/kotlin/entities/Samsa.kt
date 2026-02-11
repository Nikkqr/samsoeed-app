package com.samsoeed.entities

class Samsa(id: Int,
            price: Int,
            quantity: Int,
            filling: List<BakingFilling>): Bakery(id, price, quantity, filling) {
}