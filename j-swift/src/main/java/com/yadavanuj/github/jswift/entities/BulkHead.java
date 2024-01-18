package com.yadavanuj.github.jswift.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BulkHead {
    @Id
    private String bulkHeadId;
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;
    private int maxConcurrentCalls;
    private int maxWaitDurationInMillis;
}
