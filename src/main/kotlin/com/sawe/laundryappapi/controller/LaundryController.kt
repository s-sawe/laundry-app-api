package com.sawe.laundryappapi.controller

import com.sawe.laundryappapi.dto.LaundryDTO
import com.sawe.laundryappapi.entity.Laundry
import com.sawe.laundryappapi.service.LaundryService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1")
class LaundryController(private val laundryService: LaundryService){

    @PostMapping("/add-laundry-shop")
    fun addLaundryServiceShop(laundry: LaundryDTO): LaundryDTO{
        return laundryService.addLaundryServiceShop(laundry)

    }


}