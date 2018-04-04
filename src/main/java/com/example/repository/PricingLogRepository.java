package com.example.repository;

import com.example.entity.PricingLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingLogRepository extends JpaRepository<PricingLogEntity,Integer>{
}
