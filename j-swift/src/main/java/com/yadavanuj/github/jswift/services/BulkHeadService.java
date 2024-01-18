package com.yadavanuj.github.jswift.services;

import com.yadavanuj.github.jswift.entities.BulkHead;
import com.yadavanuj.github.jswift.entities.Tenant;
import com.yadavanuj.github.jswift.repositories.BulkHeadRepository;
import com.yadavanuj.github.jswift.repositories.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BulkHeadService {
    private final BulkHeadRepository repository;
    private final TenantRepository tenantRepository;

    @Autowired
    public BulkHeadService(BulkHeadRepository repository,
                           TenantRepository tenantRepository) {
        this.repository = repository;
        this.tenantRepository = tenantRepository;
    }

//    public JsonNode getSchema() {
//        SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_7, OptionPreset.PLAIN_JSON);
//        SchemaGeneratorConfig config = configBuilder.build();
//        SchemaGenerator generator = new SchemaGenerator(config);
//        JsonNode jsonSchema = generator.generateSchema(BulkHead.class);
//        return jsonSchema;
//    }

    public BulkHead create(BulkHead bulkHead) {
        Optional<Tenant> maybeTenant = tenantRepository.findById(bulkHead.getTenant().getTenantId());
        if (maybeTenant.isPresent()) {
            bulkHead.setTenant(maybeTenant.get());
            return repository.save(bulkHead);
        }
        throw new IllegalStateException("Tenant not found");
    }

    public List<BulkHead> getAll() {
        return this.repository.findAll();
    }
}
