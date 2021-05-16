package com.example.kotlincrudapp.controller


import com.example.kotlincrudapp.model.User
import com.example.kotlincrudapp.service.UserService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping


@Controller
class UserController @Autowired constructor( val userService: UserService) {


    @GetMapping("/users")
    fun findAll(model: Model): String {
        val users: List<User> = userService.findAll()
        model.addAttribute("users", users)
        return "user-list"
    }

    @GetMapping("/user-create")
    fun createUserForm(user: User): String {
        return "user-create"
    }

    @PostMapping("/user-create")
    fun createUser(user: User): String {
        userService.saveUser(user)
        return "redirect:/users"
    }

    @GetMapping("user-delete/{id}")
    fun deleteUser(@PathVariable("id") id: Long?): String {
        userService.deleteById(id!!)
        return "redirect:/users"
    }

    @GetMapping("/user-update/{id}")
    fun updateUserForm(@PathVariable("id") id: Long?, model: Model): String {
        val user: User = userService.findById(id!!)
        model.addAttribute("user", user)
        return "user-update"
    }

    @PostMapping("/user-update")
    fun updateUser(user: User): String {
        userService.saveUser(user)
        return "redirect:/users"
    }
}