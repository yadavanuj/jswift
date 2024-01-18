package com.yadavanuj.github.jswift.repositories;

import com.yadavanuj.github.jswift.entities.RateLimiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateLimiterRepository extends JpaRepository<RateLimiter, String> {
}
