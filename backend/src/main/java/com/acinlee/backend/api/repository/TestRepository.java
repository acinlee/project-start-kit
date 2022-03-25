package com.acinlee.backend.api.repository;

import com.acinlee.backend.api.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, String> {
}
