package com.siqueira.dev.CompanyClean.core.usecases;

import com.siqueira.dev.CompanyClean.core.entity.Company;

import java.util.UUID;

public interface FindByNameCompanyCase {
    public Company execute(String name);
}
