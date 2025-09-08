package com.siqueira.dev.CompanyClean.core.usecases;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.gateway.CompanyGateway;

import java.util.List;

public class FindCompanyCaseImpl implements FindCompanyCase{

    private final CompanyGateway companyGateway;

    public FindCompanyCaseImpl(CompanyGateway companyGateway) {
        this.companyGateway = companyGateway;
    }

    @Override
    public List<Company> execute() {
        return companyGateway.listCompanies();
    }
}
