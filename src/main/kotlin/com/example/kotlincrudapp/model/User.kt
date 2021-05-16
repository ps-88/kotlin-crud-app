package com.example.kotlincrudapp.model

import lombok.*
import javax.persistence.*



@Data
@Entity
data class User(
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            val id: Long?,
            val firstName:String?,
            val lastName:String?
)