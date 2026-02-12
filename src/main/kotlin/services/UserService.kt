package com.samsoeed.services

import com.samsoeed.repositories.UserRepository
import com.samsoeed.entities.User
import org.springframework.stereotype.Service
import org.hibernate.NonUniqueObjectException
import org.springframework.dao.EmptyResultDataAccessException

@Service
class UserService (private val userRepository: UserRepository) {
    fun createUser(user : User) : CrudResult{
        try {
            userRepository.save(user)
        }
        catch (e : NonUniqueObjectException ) {
            print(e)
            return CrudResult.AlreadyExists
        }

        return CrudResult.SuccessfullyCreated
    }

     fun removeUser(user : User) : CrudResult {
        try{
            userRepository.delete(user)
        }
        catch (e : EmptyResultDataAccessException) {
            print(e)
            return CrudResult.NotExists
        }

        return CrudResult.SuccessfullyDeleted
    }
}