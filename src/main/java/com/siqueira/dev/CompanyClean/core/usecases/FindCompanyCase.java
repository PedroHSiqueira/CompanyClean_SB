package com.siqueira.dev.CompanyClean.core.usecases;

import com.siqueira.dev.CompanyClean.core.entity.Company;

import java.util.List;

public interface FindCompanyCase {
    public List<Company> execute();
}
