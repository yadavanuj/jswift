package com.yadavanuj.github.jswift.controllers;

import com.yadavanuj.github.jswift.entities.Tenant;
import com.yadavanuj.github.jswift.services.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TenantController {
    private final TenantService service;

    @Autowired
    public TenantController(TenantService service) {
        this.service = service;
    }

    @GetMapping("/tenants")
    public List<Tenant> getAll() {
        return this.service.getAll();
    }

    @PostMapping("/tenants/add")
    public Tenant create(@RequestBody Tenant tenant) {
        return this.service.create(tenant);
    }
}
