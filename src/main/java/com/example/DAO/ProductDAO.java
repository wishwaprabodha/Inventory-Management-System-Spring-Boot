package com.example.DAO;

import com.example.Entity.Product;
import com.example.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */
@Repository
public interface ProductDAO extends JpaRepository<ProductEntity,Integer> {

     List<ProductEntity> getAllByName(String name);

}
