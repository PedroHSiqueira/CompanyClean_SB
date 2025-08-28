package com.siqueira.dev.CompanyClean.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Company")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private String address;
    private String type;
    private Integer numberOfEmployees;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
