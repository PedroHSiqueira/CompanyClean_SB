package com.siqueira.dev.CompanyClean.core.usecases;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.gateway.CompanyGateway;
import com.siqueira.dev.CompanyClean.infrastructure.exception.NotFoundCompanyException;

public class FindByNameCompanyCaseImpl implements FindByNameCompanyCase {

    private final CompanyGateway companyGateway;

    public FindByNameCompanyCaseImpl(CompanyGateway companyGateway) {
        this.companyGateway = companyGateway;
    }

    @Override
    public Company execute(String name) {
        Company company = companyGateway.findCompany(name);

        if (company == null) {
            throw new NotFoundCompanyException("Empresa Não Encontrada!");
        }

        return company;
    }
}
