package com.sawe.laundryappapi.dto

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class LaundryDTO (@Id
                      @GeneratedValue(strategy = GenerationType.IDENTITY)
                      var id: Int,
                      var name: String,
                      var rating: Double
                      )


