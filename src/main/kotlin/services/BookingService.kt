package com.samsoeed.services

import com.samsoeed.entities.Bakery
import com.samsoeed.entities.Booking
import com.samsoeed.repositories.BakingRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class BookingService(
    private val bakingRepository: BakingRepository
) {

    @Transactional
    public fun bookProducts(booking: Booking) {
        for (bakeryFromBooking in booking.getCombinationsId()) {
            val quantityOfBakery = bakeryFromBooking.quantity
            val bakeryFromDb = bakingRepository.findById(bakeryFromBooking.id).orElseThrow()

            if (bakeryFromDb.quantity < quantityOfBakery) {
                throw RuntimeException("Not enough quantity for product id=${bakeryFromBooking.id}")
            }

            bakeryFromDb.quantity -= quantityOfBakery
            bakingRepository.save<Bakery>(bakeryFromDb)
        }
    }
}