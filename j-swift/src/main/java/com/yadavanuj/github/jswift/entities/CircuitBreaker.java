package com.yadavanuj.github.jswift.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CircuitBreaker {
    @Id
    private String circuitBreakerId;
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;
    private int failureRateThresholdPercentage;
    private int permittedNumberOfCallsInHalfOpenState;
    private int slidingWindowSize;
    @Enumerated(EnumType.STRING)
    private SlidingWindowType slidingWindowType;
    private int minimumNumberOfCalls;
    private int slowCallRateThresholdPercentage;
    private int slowCallThresholdInMillis;
    private int maxWaitInHalfOpenStateInMillis;
    private int waitInOpenStateInMillis;
}
