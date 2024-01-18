package com.yadavanuj.github.jswift.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tenant")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tenant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tenantId;
    @Column(nullable = false)
    private String name;
    private String description;
}
