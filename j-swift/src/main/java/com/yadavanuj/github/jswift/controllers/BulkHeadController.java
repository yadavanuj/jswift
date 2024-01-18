package com.yadavanuj.github.jswift.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.yadavanuj.github.jswift.entities.BulkHead;
import com.yadavanuj.github.jswift.services.BulkHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class BulkHeadController {
    private final BulkHeadService service;

    @Autowired
    public BulkHeadController(BulkHeadService service) {
        this.service = service;
    }

    @GetMapping("/bulkheads")
    public List<BulkHead> getAll() {
        return service.getAll();
    }

    @GetMapping("/bulkheads/schema")
    public JsonNode getSchema() {
        return service.getSchema();
    }


    @PostMapping("/bulkheads/add")
    public BulkHead create(@RequestBody BulkHead bulkHead) {
        if (bulkHead.getTenant().getTenantId() > 0) {
            return service.create(bulkHead);
        }
        // TODO: Handle
        return null;
    }
}
