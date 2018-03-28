package com.example.DAO;

import com.example.Entity.Category;
import com.example.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */
@Repository
public interface CategoryDAO extends JpaRepository<CategoryEntity,Integer> {


    List<CategoryEntity> getAllByName(String name);
}
