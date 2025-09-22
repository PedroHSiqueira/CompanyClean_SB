package com.siqueira.dev.CompanyClean.infrastructure.Mapper;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.infrastructure.persistence.CompanyEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyEntityMapper {
    public CompanyEntity toEntity(Company company) {
        return new CompanyEntity(company.getId(),company.getName(),company.getDescription(),company.getAddress(),company.getType(),company.getNumberOfEmployees(), company.getCompanySize(),company.getCreateAt(),company.getUpdateAt());
    }

    public Company toDomain(CompanyEntity companyEntity) {
        return new Company(companyEntity.getId(), companyEntity.getName(), companyEntity.getDescription(), companyEntity.getAddress(), companyEntity.getType(), companyEntity.getNumberOfEmployees(), companyEntity.getCompanySize(), companyEntity.getCreateAt(), companyEntity.getUpdateAt());
    }
}
