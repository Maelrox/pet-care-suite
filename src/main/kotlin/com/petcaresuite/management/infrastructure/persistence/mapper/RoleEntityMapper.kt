package com.petcaresuite.management.infrastructure.persistence.mapper

import com.petcaresuite.management.domain.model.Role
import com.petcaresuite.management.infrastructure.persistence.entity.RoleEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper(componentModel = "spring", uses = [CompanyEntityMapper::class, ModuleEntityMapper::class])
interface RoleEntityMapper {

    @Mappings(
        Mapping(target = "company", source = "company"),
    )
    fun toEntity(roleModel: Role): RoleEntity

    fun toDomain(roleEntity: RoleEntity): Role

    fun toDomainSet(roleEntities: List<RoleEntity>): List<Role>

    fun toEntity(roleModel: List<Role>): List<RoleEntity>

}