package com.samsoeed.repositories

import com.samsoeed.entities.BakeryCombination
import com.samsoeed.entities.BakeryType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BakeryCombinationRepository : JpaRepository<BakeryCombination, Int> {
    fun findByBakeryName(bakeryName: BakeryType) : BakeryCombination?
}