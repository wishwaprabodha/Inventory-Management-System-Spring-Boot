package com.example.service;

import com.example.entity.CategoryLog;
import com.example.repository.CategoryLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class CategoryLogService {
    @Autowired
    private CategoryLogRepository categoryLogRepository;

    public void insert(CategoryLog categoryLog) {
        categoryLogRepository.save(categoryLog);
    }


    public Optional<CategoryLog> findById(int id) {
        return categoryLogRepository.findById(id);
    }

    public Iterable<CategoryLog> findAll() {
        return categoryLogRepository.findAll();
    }

    public void updateCategoryLog(CategoryLog categoryLog) {
        categoryLogRepository.save(categoryLog);
    }

    public void deletecategoryLog(CategoryLog categoryLog) {
        categoryLogRepository.delete(categoryLog);
    }




}
