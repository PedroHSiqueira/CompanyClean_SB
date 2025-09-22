package com.siqueira.dev.CompanyClean.core.usecases;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.gateway.CompanyGateway;

import java.util.List;

public class ListCompanyCaseImpl implements ListCompanyCase {

    private final CompanyGateway companyGateway;

    public ListCompanyCaseImpl(CompanyGateway companyGateway) {
        this.companyGateway = companyGateway;
    }

    @Override
    public List<Company> execute() {
        return companyGateway.listCompanies();
    }
}
