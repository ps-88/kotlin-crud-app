package com.example.kotlincrudapp.service


import com.example.kotlincrudapp.model.User
import com.example.kotlincrudapp.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class UserService @Autowired constructor(userRepository: UserRepo) {
     val userRepository: UserRepo = userRepository


    fun findById(id: Long): User {
        return userRepository.findById(id).orElse(null)
    }

    fun findAll(): List<User> {
        return userRepository.findAll()
    }

    fun saveUser(user: User): User {
        return userRepository.save(user)
    }

    fun deleteById(id: Long) {
        userRepository.deleteById(id)
    }

}