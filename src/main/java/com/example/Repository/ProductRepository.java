package com.example.Repository;

import com.example.Entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */
@Repository
public interface ProductRepository extends CrudRepository<ProductEntity,Integer>{

}
