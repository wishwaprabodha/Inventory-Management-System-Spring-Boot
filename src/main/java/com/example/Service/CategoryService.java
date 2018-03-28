package com.example.Service;

import com.example.Entity.CategoryEntity;
import com.example.DAO.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */

@Repository
@Transactional
public class CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;


    @PersistenceContext
    private EntityManager entityManager;

    public int insert(CategoryEntity category) {
        entityManager.persist(category);
        return category.getCategoryId();
    }


    public CategoryEntity find(int  id) {
        return entityManager.find(CategoryEntity.class, id);
    }

    public List<CategoryEntity> findAll() {
        Query query = entityManager.createNamedQuery("Category.add",CategoryEntity.class);
        return query.getResultList();
    }

    public void addCategory(CategoryEntity categoryNew){
        categoryDAO.save(categoryNew);
    }

    public Optional<CategoryEntity> searchCategory(int  id){
        return categoryDAO.findById(id);
    }

    public void updateCategory(int  id,CategoryEntity category){
        categoryDAO.save(category);
    }

    public void deleteCategory(int  id){
        categoryDAO.deleteById(id);
    }

    public List<CategoryEntity> getByName(String name){return categoryDAO.getAllByName(name); }



}
