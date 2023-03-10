package com.sawe.laundryappapi.service.implementation

import com.sawe.laundryappapi.dto.LaundryDTO
import com.sawe.laundryappapi.entity.Laundry
import com.sawe.laundryappapi.repository.LaundryRepository
import com.sawe.laundryappapi.service.LaundryService
import com.sawe.laundryappapi.utils.mapper.LaundryMapper
import org.springframework.stereotype.Service

@Service
class LaundryServiceImpl(private val laundryRepository: LaundryRepository, private val laundryMapper: LaundryMapper): LaundryService {

    override fun addLaundryServiceShop(laundry: LaundryDTO): LaundryDTO {
        val laundry = laundryMapper.toEntity(laundry)
        laundryRepository.save(laundry)
        return laundryMapper.fromEntity(laundry)
    }
}