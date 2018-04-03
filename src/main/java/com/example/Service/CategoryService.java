package com.example.Service;

import com.example.Entity.Category;
import com.example.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */


@Transactional
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public int insert(Category category) {
        //entityManager.persist(category);

        categoryRepository.save(category);
        return category.getCategoryId();
    }


    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
        //return entityManager.find(Category.class, id);
    }

    public Iterable<Category> findAll() {
        //Query query = entityManager.createNamedQuery("Category.add",Category.class);
        return categoryRepository.findAll();
    }

    //Implemented already
   /* public void addCategory(Category categoryNew){
        categoryDAO.addCategory(categoryNew);
    }*/


    public void updateCategory(int id, Category category) {

        categoryRepository.save(category);
    }

    public void deleteCategory(int id) {

        categoryRepository.deleteById(id);
    }


}
