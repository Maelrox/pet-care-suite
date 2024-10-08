package com.petcaresuite.management.application.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.petcaresuite.management.application.service.messages.Responses
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PermissionModulesDTO(
    @field:NotNull(message = Responses.PERMISSION_ID_REQUIRED)
    val id: Long,
    @field:NotNull(message = Responses.PERMISSION_NAME_REQUIRED)
    @field:Size(min = 3, max = 32, message = Responses.PERMISSION_LENGTH_INVALID)
    val name: String,
    val modulesAction: Set<ModulesActionDTO>,
    val moduleId: Long
)
