package com.siqueira.dev.CompanyClean.infrastructure.bean;

import com.siqueira.dev.CompanyClean.core.gateway.CompanyGateway;
import com.siqueira.dev.CompanyClean.core.usecases.CreateCompanyCase;
import com.siqueira.dev.CompanyClean.core.usecases.CreateCompanyCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration{

    @Bean
    public CreateCompanyCase createCompanyCase(CompanyGateway companyGateway){
        return new CreateCompanyCaseImpl(companyGateway);
    };
}
