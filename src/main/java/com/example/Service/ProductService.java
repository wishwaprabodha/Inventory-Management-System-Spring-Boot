package com.example.Service;

import com.example.Repository.ProductRepository;
import com.example.Entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */


@Transactional
@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

        //Return type confliction,changed to void
    public void insert(ProductEntity product) {
        productRepository.save(product);
    }

    public Optional<ProductEntity> find(int  id) {
        return productRepository.findById(id);
    }

    /*public List<ProductEntity> findAll() {
        Query query = entityManager.createNamedQuery("Product.add",ProductEntity.class);
        return query.getResultList();
    }*/

  /*  public void addProduct(ProductEntity productNew){

        productDAO.;
    }*/
/*
    public Optional<ProductEntity> searchProduct(int  id){

        return productDAO.findById(id);
    }*/

    public void updateProduct(ProductEntity product){

        productRepository.save(product);
    }

    public void deleteProduct(int  id){

        productRepository.deleteById(id);
    }


}
