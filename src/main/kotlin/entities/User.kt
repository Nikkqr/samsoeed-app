package com.samsoeed.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : UInt,

    @Column
    val name : String,

    @Column
    val surname : String,

    @Column
    val role : Role,

    @Column
    val email : String,

    @Column
    val password : String)