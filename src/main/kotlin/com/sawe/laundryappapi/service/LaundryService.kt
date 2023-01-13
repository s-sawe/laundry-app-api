package com.sawe.laundryappapi.service

import com.sawe.laundryappapi.dto.LaundryDTO
import com.sawe.laundryappapi.entity.Laundry

interface LaundryService {

    fun addLaundryServiceShop(laundry: LaundryDTO): LaundryDTO
}