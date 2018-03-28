package com.example.Service;

import com.example.Entity.Product;
import com.example.DAO.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */

@Repository
@Transactional

public class ProductService {

    @Autowired
    public ProductDAO productDAO;


    @PersistenceContext
    private EntityManager entityManager;

    public int insert(Product product) {
        entityManager.persist(product);
        return product.getProductId();
    }

    public Product find(int  id) {
        return entityManager.find(Product.class, id);
    }

    public List<Product> findAll() {
        Query query = entityManager.createNamedQuery("Product.add",Product.class);
        return query.getResultList();
    }

    public void addProduct(Product productNew){
        productDAO.save(productNew);
    }

    public Optional<Product> searchProduct(int  id){
        return productDAO.findById(id);
    }

    public void updateProduct(int  id,Product product){
        productDAO.save(product);
    }

    public void deleteProduct(int  id){
        productDAO.deleteById(id);
    }

    public List<Product> getByName(String name){return productDAO.getAllByName(name); }
}
