package com.siqueira.dev.CompanyClean.infrastructure.bean;

import com.siqueira.dev.CompanyClean.core.gateway.CompanyGateway;
import com.siqueira.dev.CompanyClean.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration{

    @Bean
    public CreateCompanyCase createCompanyCase(CompanyGateway companyGateway){
        return new CreateCompanyCaseImpl(companyGateway);
    };

    @Bean
    public ListCompanyCase findCompanyCase(CompanyGateway companyGateway){
        return new ListCompanyCaseImpl(companyGateway);
    }

    @Bean
    public FindByNameCompanyCase  findByNameCompanyCase(CompanyGateway companyGateway){
        return new FindByNameCompanyCaseImpl(companyGateway);
    }
}
