package com.yadavanuj.github.jswift.services;

import com.yadavanuj.github.jswift.entities.CircuitBreaker;
import com.yadavanuj.github.jswift.entities.Tenant;
import com.yadavanuj.github.jswift.repositories.CircuitBreakerRepository;
import com.yadavanuj.github.jswift.repositories.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CircuitBreakerService {
    private final CircuitBreakerRepository circuitBreakerRepository;
    private final TenantRepository tenantRepository;

    @Autowired
    public CircuitBreakerService(CircuitBreakerRepository circuitBreakerRepository,
                                 TenantRepository tenantRepository) {
        this.circuitBreakerRepository = circuitBreakerRepository;
        this.tenantRepository = tenantRepository;
    }

    public CircuitBreaker create(CircuitBreaker circuitBreaker) {
        Optional<Tenant> maybeTenant = tenantRepository.findById(circuitBreaker.getTenant().getTenantId());
        if (maybeTenant.isPresent()) {
            circuitBreaker.setTenant(maybeTenant.get());
            return circuitBreakerRepository.save(circuitBreaker);
        }
        throw new IllegalStateException("Tenant not found");
    }

    public List<CircuitBreaker> getAll() {
        return this.circuitBreakerRepository.findAll();
    }
}
