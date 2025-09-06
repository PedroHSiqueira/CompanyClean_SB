package com.siqueira.dev.CompanyClean.core.usecases;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.gateway.CompanyGateway;

public class CreateCompanyCaseImpl implements CreateCompanyCase{

    private final CompanyGateway companyGateway;

    public CreateCompanyCaseImpl(CompanyGateway companyGateway) {
        this.companyGateway = companyGateway;
    }

    @Override
    public Company execute(Company company) {
        return company;
    }
}
