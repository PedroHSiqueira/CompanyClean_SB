package com.siqueira.dev.CompanyClean.infrastructure.controller;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.usecases.CreateCompanyCase;
import com.siqueira.dev.CompanyClean.core.usecases.FindCompanyCase;
import com.siqueira.dev.CompanyClean.infrastructure.Dto.CompanyDTO;
import com.siqueira.dev.CompanyClean.infrastructure.Mapper.CompanyMapper;
import com.siqueira.dev.CompanyClean.infrastructure.persistence.CompanyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Company")
public class CompanyController {

    private final CreateCompanyCase createCompanyCase;
    private final FindCompanyCase  findCompanyCase;
    private final CompanyMapper companyMapper;

    public CompanyController(CreateCompanyCase createCompanyCase, FindCompanyCase findCompanyCase, CompanyMapper companyMapper) {
        this.createCompanyCase = createCompanyCase;
        this.findCompanyCase = findCompanyCase;
        this.companyMapper = companyMapper;
    }

    @PostMapping
    public CompanyDTO createCompany(@RequestBody CompanyDTO companyDTO) {
        Company newCompany = createCompanyCase.execute(companyMapper.toModel(companyDTO));
        return companyMapper.toDomain(newCompany);
    }

    @GetMapping
    public List<Company> listCompanies() {
        return findCompanyCase.execute();
    }
}
