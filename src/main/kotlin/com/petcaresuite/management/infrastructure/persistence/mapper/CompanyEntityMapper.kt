package com.petcaresuite.management.infrastructure.persistence.mapper

import com.petcaresuite.management.domain.model.Company
import com.petcaresuite.management.infrastructure.persistence.entity.CompanyEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface CompanyEntityMapper {

    @Mapping(target = "users", ignore = true)
    fun toEntity(company: Company): CompanyEntity

    @Mapping(target = "users", ignore = true)
    fun toDomain(companyEntity: CompanyEntity): Company
}