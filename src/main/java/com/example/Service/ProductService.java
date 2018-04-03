package com.example.Service;

import com.example.Entity.Product;
import com.example.Repository.ProductRepository;
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
    public void insert(Product product) {
        productRepository.save(product);
    }

    public Optional<Product> find(int id) {
        return productRepository.findById(id);
    }

    /*public List<Product> findAll() {
        Query query = entityManager.createNamedQuery("Product.add",Product.class);
        return query.getResultList();
    }*/

  /*  public void addProduct(Product productNew){

        productDAO.;
    }*/
/*
    public Optional<Product> searchProduct(int  id){

        return productDAO.findById(id);
    }*/

    public void updateProduct(Product product) {

        productRepository.save(product);
    }

    public void deleteProduct(int id) {

        productRepository.deleteById(id);
    }


}
