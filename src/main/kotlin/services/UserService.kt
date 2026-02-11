package com.samsoeed.services

import com.samsoeed.repositories.UserRepository
import entities.User
import org.springframework.stereotype.Service
import org.hibernate.NonUniqueObjectException
import org.springframework.dao.EmptyResultDataAccessException

@Service
class UserService (private val userRepository: UserRepository){
    public fun createUser(user : User) : CrudResult{
        try {
            userRepository.save<User>(user)
        } catch (e : NonUniqueObjectException ){
            print(e)
            return CrudResult.AlreadyExists
        }

        return CrudResult.SuccessfullyCreated
    }

    public fun removeUser(user : User) : CrudResult{
        try{
            userRepository.delete(user)
        } catch (e : EmptyResultDataAccessException) {
            print(e)
            return CrudResult.NotExists
        }

        return CrudResult.SuccessfullyDeleted
    }
}