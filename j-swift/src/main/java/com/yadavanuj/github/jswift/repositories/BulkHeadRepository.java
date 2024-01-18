package com.yadavanuj.github.jswift.repositories;

import com.yadavanuj.github.jswift.entities.BulkHead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BulkHeadRepository extends JpaRepository<BulkHead, String> {
}
