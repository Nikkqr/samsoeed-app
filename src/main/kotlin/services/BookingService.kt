package com.samsoeed.services

import com.samsoeed.entities.BakeryType
import com.samsoeed.repositories.BakeryCombinationRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class BookingService(
    private val bakeryCombinationRepository: BakeryCombinationRepository
) {

    @Transactional
    fun bookProducts(vararg bakeries: BakeryType) {
        for (bakery in bakeries) {
            val quantityOfBakery = bakeries.size
            val bakeryFromDb = bakeryCombinationRepository.findByBakeryName(bakery)

            if (bakeryFromDb != null) {
                if (bakeryFromDb.quantity < quantityOfBakery) {
                    throw RuntimeException("Not enough quantity for product ${bakery.name}")
                }
            }

            bakeryFromDb?.let { bakeryFromDb.quantity -= quantityOfBakery }

            if (bakeryFromDb != null) {
                bakeryCombinationRepository.save(bakeryFromDb)
            }
        }
    }
}