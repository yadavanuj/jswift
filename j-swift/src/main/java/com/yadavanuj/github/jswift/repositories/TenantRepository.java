package com.yadavanuj.github.jswift.repositories;

import com.yadavanuj.github.jswift.entities.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> { }
