package com.sawe.laundryappapi.utils.mapper

import com.sawe.laundryappapi.dto.LaundryDTO
import com.sawe.laundryappapi.entity.Laundry
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Component


@Component @AllArgsConstructor @NoArgsConstructor @RequiredArgsConstructor
class LaundryMapper: Mapper<LaundryDTO, Laundry> {
    override fun fromEntity(entity: Laundry): LaundryDTO {
        return LaundryDTO(
            entity.id,
            entity.name,
            entity.rating
        )
    }

    override fun toEntity(domain: LaundryDTO): Laundry = Laundry(
            domain.id,
            domain.name,
            domain.rating
    )

}