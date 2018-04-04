package com.example.repository;

import com.example.entity.SupplierLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierLogRepository extends JpaRepository<SupplierLogEntity,Integer>{
}
