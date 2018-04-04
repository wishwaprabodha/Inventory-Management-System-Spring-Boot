package com.example.repository;

import com.example.entity.CategoryLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryLogRepository extends JpaRepository<CategoryLog,Integer> {

}
