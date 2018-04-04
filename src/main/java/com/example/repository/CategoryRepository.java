package com.example.repository;

import com.example.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {


}
