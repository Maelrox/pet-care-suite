package com.petcaresuite.management.application.mapper

import com.petcaresuite.management.application.dto.RoleDTO
import com.petcaresuite.management.domain.model.Role
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface RoleMapper {

    fun toDomain(roleDTO: RoleDTO): Role

    fun toDTO(role: Role): RoleDTO

}