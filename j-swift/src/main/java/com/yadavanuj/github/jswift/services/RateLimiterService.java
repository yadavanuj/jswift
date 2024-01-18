package com.yadavanuj.github.jswift.services;

import com.yadavanuj.github.jswift.entities.RateLimiter;
import com.yadavanuj.github.jswift.entities.Tenant;
import com.yadavanuj.github.jswift.repositories.RateLimiterRepository;
import com.yadavanuj.github.jswift.repositories.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RateLimiterService {
    private final RateLimiterRepository rateLimiterRepository;
    private final TenantRepository tenantRepository;

    @Autowired
    public RateLimiterService(RateLimiterRepository rateLimiterRepository,
                              TenantRepository tenantRepository) {
        this.rateLimiterRepository = rateLimiterRepository;
        this.tenantRepository = tenantRepository;
    }

    public RateLimiter create(RateLimiter rateLimiter) {
        Optional<Tenant> maybeTenant = tenantRepository.findById(rateLimiter.getTenant().getTenantId());
        if (maybeTenant.isPresent()) {
            rateLimiter.setTenant(maybeTenant.get());
            return rateLimiterRepository.save(rateLimiter);
        }
        throw new IllegalStateException("Tenant not found");
    }

    public List<RateLimiter> getAll() {
        return rateLimiterRepository.findAll();
    }
}
