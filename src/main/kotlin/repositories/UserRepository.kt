package com.samsoeed.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import com.samsoeed.entities.User

@Repository
interface UserRepository : JpaRepository<User, UInt>{
}