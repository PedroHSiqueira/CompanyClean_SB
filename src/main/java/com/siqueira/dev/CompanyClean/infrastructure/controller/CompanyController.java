package com.siqueira.dev.CompanyClean.infrastructure.controller;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.usecases.CreateCompanyCase;
import com.siqueira.dev.CompanyClean.infrastructure.Dto.CompanyDTO;
import com.siqueira.dev.CompanyClean.infrastructure.Mapper.CompanyMapper;
import com.siqueira.dev.CompanyClean.infrastructure.persistence.CompanyRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Company")
public class CompanyController {

    private final CreateCompanyCase createCompanyCase;
    private final CompanyMapper companyMapper;

    public CompanyController(CreateCompanyCase createCompanyCase, CompanyRepository companyRepository, CompanyMapper companyMapper) {
        this.createCompanyCase = createCompanyCase;
        this.companyMapper = companyMapper;
    }

    @PostMapping
    public CompanyDTO createCompany(@RequestBody CompanyDTO companyDTO) {
        Company newCompany = createCompanyCase.execute(companyMapper.toModel(companyDTO));
        return companyMapper.toDomain(newCompany);
    }

    @GetMapping
    public String listCompanies() {
        return "List of Companies";
    }
}
