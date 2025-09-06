package com.siqueira.dev.CompanyClean.infrastructure.gateway;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.gateway.CompanyGateway;
import com.siqueira.dev.CompanyClean.infrastructure.Mapper.CompanyEntityMapper;
import com.siqueira.dev.CompanyClean.infrastructure.persistence.CompanyEntity;
import com.siqueira.dev.CompanyClean.infrastructure.persistence.CompanyRepository;
import org.springframework.stereotype.Component;

@Component
public class CompanyRepositoryGateway implements CompanyGateway {

    private final CompanyRepository companyRepository;
    private final CompanyEntityMapper  companyEntityMapper;

    public CompanyRepositoryGateway(CompanyEntityMapper companyEntityMapper, CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
        this.companyEntityMapper = companyEntityMapper;
    }

    @Override
    public Company createCompany(Company company) {
        CompanyEntity companyEntity = companyEntityMapper.toEntity(company);
        CompanyEntity saveCompany = companyRepository.save(companyEntity);
        return companyEntityMapper.toDomain(saveCompany);
    }
}
