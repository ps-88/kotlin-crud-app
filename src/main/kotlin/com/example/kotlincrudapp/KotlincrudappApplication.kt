package com.example.kotlincrudapp

import com.example.kotlincrudapp.model.User
import com.example.kotlincrudapp.service.UserService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlincrudappApplication

fun main(args: Array<String>) {
    val context = runApplication<KotlincrudappApplication>(*args)


}
