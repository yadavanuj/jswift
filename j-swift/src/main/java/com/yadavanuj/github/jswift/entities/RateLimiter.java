package com.yadavanuj.github.jswift.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RateLimiter {
    @Id
    private String rateLimiterId;
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;
    private long capacity;
    private int timeoutInMillis;
    private int limitForPeriod;
    private int limitRefreshPeriodInMillis;
    @Enumerated(EnumType.STRING)
    private RefillStrategy refillStrategy;

}
