package com.sawe.laundryappapi.controller

import com.sawe.laundryappapi.dto.LaundryDTO
import com.sawe.laundryappapi.service.LaundryService
import org.springframework.web.bind.annotation.RestController


@RestController
class LaundryController(private val laundryService: LaundryService){

    fun addLaundryServiceShop(laundryDTO: LaundryDTO): LaundryDTO{
        return laundryService.addLaundryServiceShop(laundryDTO)

    }


}