package com.sawe.laundryappapi.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


data class Laundry(

    var id: Int,
    var name: String,
    var rating: Double
)
