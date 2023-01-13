package com.sawe.laundryappapi.repository

import com.sawe.laundryappapi.entity.Laundry
import org.springframework.data.repository.CrudRepository

interface LaundryRepository: CrudRepository<Laundry, Int>{

    /*fun addLaundryService(LaundryDTO: LaundryDTO)
    fun getLaundryService(id: Int)*/
}