package com.samsoeed.entities

abstract class Bakery(

    val id: Int,

    val price: Int,

    val quantity: Int,

    var filling: List<BakingFilling>
)