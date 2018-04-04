package com.example.repository;

import com.example.entity.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,Integer> {
}
