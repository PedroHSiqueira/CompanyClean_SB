package com.siqueira.dev.CompanyClean.core.usecases;

import com.siqueira.dev.CompanyClean.core.entity.Company;

import java.util.UUID;

public interface FindCompanyCase {
    public Company execute(UUID uuid);
}
