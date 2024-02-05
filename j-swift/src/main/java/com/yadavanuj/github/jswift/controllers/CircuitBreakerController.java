package com.yadavanuj.github.jswift.controllers;

import com.yadavanuj.github.jswift.entities.CircuitBreaker;
import com.yadavanuj.github.jswift.services.CircuitBreaker2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CircuitBreakerController {

    private final CircuitBreaker2 service;

    @Autowired
    public CircuitBreakerController(CircuitBreaker2 service) {
        this.service = service;
    }

    @PostMapping("/circuit-breaker/add")
    public CircuitBreaker create(CircuitBreaker circuitBreaker) {
        return null;
    }

    @GetMapping("/circuit-breakers")
    public List<CircuitBreaker> getAll() {
        return null;
    }
}
