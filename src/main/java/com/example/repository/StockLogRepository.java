package com.example.repository;

import com.example.entity.StockLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockLogRepository extends JpaRepository<StockLogEntity,Integer>{
}
