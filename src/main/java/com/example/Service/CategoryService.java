package com.example.Service;

import com.example.Entity.CategoryEntity;
import com.example.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */


@Transactional
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public int insert(CategoryEntity category) {
        //entityManager.persist(category);

        categoryRepository.save(category);
        return category.getCategoryId();
    }


    public Optional<CategoryEntity> findById(int id) {
        return categoryRepository.findById(id);
        //return entityManager.find(CategoryEntity.class, id);
    }

    public Iterable<CategoryEntity> findAll() {
        //Query query = entityManager.createNamedQuery("Category.add",CategoryEntity.class);
        return categoryRepository.findAll();
    }

    //Implemented already
   /* public void addCategory(CategoryEntity categoryNew){
        categoryDAO.addCategory(categoryNew);
    }*/


    public void updateCategory(int id, CategoryEntity category) {

        categoryRepository.save(category);
    }

    public void deleteCategory(int id) {

        categoryRepository.deleteById(id);
    }


}
