package com.siqueira.dev.CompanyClean.infrastructure.controller;

import com.siqueira.dev.CompanyClean.core.entity.Company;
import com.siqueira.dev.CompanyClean.core.usecases.CreateCompanyCase;
import com.siqueira.dev.CompanyClean.core.usecases.FindByNameCompanyCase;
import com.siqueira.dev.CompanyClean.core.usecases.ListCompanyCase;
import com.siqueira.dev.CompanyClean.infrastructure.Dto.CompanyDTO;
import com.siqueira.dev.CompanyClean.infrastructure.Mapper.CompanyMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/Company")
public class CompanyController {

    private final CreateCompanyCase createCompanyCase;
    private final ListCompanyCase listCompanyCase;
    private final FindByNameCompanyCase findByNameCompanyCase;
    private final CompanyMapper companyMapper;

    public CompanyController(CreateCompanyCase createCompanyCase, ListCompanyCase listCompanyCase, FindByNameCompanyCase findByNameCompanyCase, CompanyMapper companyMapper) {
        this.createCompanyCase = createCompanyCase;
        this.listCompanyCase = listCompanyCase;
        this.findByNameCompanyCase = findByNameCompanyCase;
        this.companyMapper = companyMapper;
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> createCompany(@RequestBody CompanyDTO companyDTO) {
        Company newCompany = createCompanyCase.execute(companyMapper.toModel(companyDTO));
        Map<String, Object> response = new HashMap<>();
        response.put("Message:", "Criado com Sucesso!");
        response.put("Company:", newCompany);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public List<CompanyDTO> listCompanies() {
        return listCompanyCase.execute().stream().map(companyMapper::toDomain).toList();
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Map<String, Object>> findCompany(@PathVariable String name) {
        Company company = findByNameCompanyCase.execute(name);
        Map<String, Object> response = new HashMap<>();
        response.put("Message", "Encontrado!");
        response.put("Company", company);
        return ResponseEntity.ok(response);
    }
}
