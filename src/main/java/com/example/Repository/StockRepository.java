package com.example.Repository;

import com.example.Entity.StockEntity;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<StockEntity,Integer> {
}
