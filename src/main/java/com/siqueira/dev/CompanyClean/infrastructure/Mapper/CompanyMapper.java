package com.siqueira.dev.CompanyClean.infrastructure.Mapper;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.infrastructure.Dto.CompanyDTO;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {

    public Company toModel(CompanyDTO companyDTO) {
        return new Company(companyDTO.id(),companyDTO.name(),companyDTO.description(),companyDTO.address(),companyDTO.type(),companyDTO.numberOfEmployees(), companyDTO.companySize(),companyDTO.createAt(),companyDTO.updateAt());
    }

    public CompanyDTO toDomain(Company Company) {
        return new CompanyDTO(Company.getId(), Company.getName(), Company.getDescription(), Company.getAddress(), Company.getType(), Company.getNumberOfEmployees(), Company.getCompanySize(), Company.getCreateAt(), Company.getUpdateAt());
    }
}
