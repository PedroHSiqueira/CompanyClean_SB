package com.siqueira.dev.CompanyClean.infrastructure.gateway;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.gateway.CompanyGateway;
import org.springframework.stereotype.Component;

@Component
public class CompanyRepositoryGateway implements CompanyGateway {

    @Override
    public Company createCompany(Company company) {
        return null;
    }
}
