package com.example.kotlincrudapp.repo

import com.example.kotlincrudapp.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepo : JpaRepository<User, Long> {
}