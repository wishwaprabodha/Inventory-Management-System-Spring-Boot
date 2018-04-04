package com.example.repository;

import com.example.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
