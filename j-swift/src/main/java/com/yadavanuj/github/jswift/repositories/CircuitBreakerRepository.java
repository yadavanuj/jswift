package com.yadavanuj.github.jswift.repositories;

import com.yadavanuj.github.jswift.entities.CircuitBreaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitBreakerRepository extends JpaRepository<CircuitBreaker, String> {
}
