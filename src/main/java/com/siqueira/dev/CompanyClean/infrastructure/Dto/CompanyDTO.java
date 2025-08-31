package com.siqueira.dev.CompanyClean.infrastructure.Dto;

import com.siqueira.dev.CompanyClean.core.Enums.CompanySize;

import java.time.LocalDateTime;
import java.util.UUID;

public record CompanyDTO(UUID id,
                         String name,
                         String description,
                         String address,
                         String type,
                         Integer numberOfEmployees,
                         CompanySize companySize,
                         LocalDateTime createAt,
                         LocalDateTime updateAt) {
}
