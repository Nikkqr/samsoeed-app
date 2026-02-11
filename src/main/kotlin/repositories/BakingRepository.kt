package com.samsoeed.repositories

import com.samsoeed.entities.Bakery
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BakingRepository : JpaRepository<Bakery, Int>