package com.siqueira.dev.CompanyClean.core.entity;

import com.siqueira.dev.CompanyClean.core.Enums.CompanySize;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Company {
    private UUID id;
    private String name;
    private String description;
    private String address;
    private String type;
    private Integer numberOfEmployees;
    private CompanySize companySize;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public Company() {
    }

    public Company(UUID id, String name, String description, String address, String type, Integer numberOfEmployees, CompanySize companySize, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.type = type;
        this.numberOfEmployees = numberOfEmployees;
        this.companySize = companySize;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public CompanySize getCompanySize() {
        return companySize;
    }

    public void setCompanySize(CompanySize companySize) {
        this.companySize = companySize;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(description, company.description) && Objects.equals(address, company.address) && Objects.equals(type, company.type) && Objects.equals(numberOfEmployees, company.numberOfEmployees) && companySize == company.companySize && Objects.equals(createAt, company.createAt) && Objects.equals(updateAt, company.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, address, type, numberOfEmployees, companySize, createAt, updateAt);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", companySize=" + companySize +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
