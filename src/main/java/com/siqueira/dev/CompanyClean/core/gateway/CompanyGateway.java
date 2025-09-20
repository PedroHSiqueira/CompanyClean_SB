package com.siqueira.dev.CompanyClean.core.gateway;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.infrastructure.persistence.CompanyEntity;

import java.util.List;
import java.util.Optional;

public interface CompanyGateway {

    Company createCompany(Company company);

    List<Company> listCompanies();

    Company findCompany(String name);
}
