package com.siqueira.dev.CompanyClean.core.usecases;

import com.siqueira.dev.CompanyClean.core.entity.Company;

public interface CreateCompanyCase {

    public Company execute(Company company);
}
