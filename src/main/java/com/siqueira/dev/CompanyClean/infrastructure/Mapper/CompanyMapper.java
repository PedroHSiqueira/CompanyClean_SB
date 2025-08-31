package com.siqueira.dev.CompanyClean.infrastructure.Mapper;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.infrastructure.Dto.CompanyDTO;
import com.siqueira.dev.CompanyClean.infrastructure.persistence.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {

    public Company toModel(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setId(companyDTO.id());
        company.setName(companyDTO.name());
        company.setDescription(companyDTO.description());
        company.setAddress(companyDTO.address());
        company.setType(companyDTO.type());
        company.setNumberOfEmployees(companyDTO.numberOfEmployees());
        company.setCreateAt(companyDTO.createAt());
        company.setUpdateAt(companyDTO.updateAt());
        return company;
    }

    public CompanyDTO toDTO(Company Company) {
        return new CompanyDTO(Company.getId(), Company.getName(), Company.getDescription(), Company.getAddress(), Company.getType(), Company.getNumberOfEmployees(), Company.getCompanySize(), Company.getCreateAt(), Company.getUpdateAt());
    }
}
