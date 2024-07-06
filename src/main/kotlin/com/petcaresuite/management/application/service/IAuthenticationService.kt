package com.petcaresuite.management.application.service

import com.petcaresuite.management.application.dto.AuthenticationRequestDTO
import com.petcaresuite.management.application.dto.AuthenticationResponseDTO

interface IAuthenticationService {

    fun authenticate(request: AuthenticationRequestDTO): AuthenticationResponseDTO

}