package com.example.Service;

import com.example.DAO.ProductDAO;
import com.example.Entity.ProductEntity;
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

    public int insert(ProductEntity product) {
        entityManager.persist(product);
        return product.getProductId();
    }

    public ProductEntity find(int  id) {
        return entityManager.find(ProductEntity.class, id);
    }

    public List<ProductEntity> findAll() {
        Query query = entityManager.createNamedQuery("Product.add",ProductEntity.class);
        return query.getResultList();
    }

    public void addProduct(ProductEntity productNew){
        productDAO.save(productNew);
    }

    public Optional<ProductEntity> searchProduct(int  id){
        return productDAO.findById(id);
    }

    public void updateProduct(int  id,ProductEntity product){
        productDAO.save(product);
    }

    public void deleteProduct(int  id){
        productDAO.deleteById(id);
    }

    public List<ProductEntity> getByName(String name){return productDAO.getAllByName(name); }
}
