package com.yadavanuj.github.jswift.services;

import com.yadavanuj.github.jswift.entities.Tenant;
import com.yadavanuj.github.jswift.repositories.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TenantService {
    private final TenantRepository repository;

    @Autowired
    public TenantService(TenantRepository repository) {
        this.repository = repository;
    }

    public List<Tenant> getAll() {
        return this.repository.findAll();
    }

    public Optional<Tenant> getById(Long tenantId) {
        return this.repository.findById(tenantId);
    }

    public Tenant create(Tenant tenant) {
        return this.repository.save(tenant);
    }
}
