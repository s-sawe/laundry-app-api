package com.sawe.laundryappapi.service

import com.sawe.laundryappapi.dto.LaundryDTO

interface LaundryService {

    fun addLaundryServiceShop(LaundryDTO: LaundryDTO)
}