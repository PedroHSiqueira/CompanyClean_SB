package com.siqueira.dev.CompanyClean.core.gateway;

import com.siqueira.dev.CompanyClean.core.entity.Company;

import java.util.List;

public interface CompanyGateway {

    Company createCompany(Company company);

    List<Company> listCompanies();
}
