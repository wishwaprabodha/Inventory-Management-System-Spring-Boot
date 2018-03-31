package com.example.Service;

import com.example.Entity.CategoryEntity;
import com.example.Repository.XategoryRepository;
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
public class XategoryService {

    @Autowired
    private XategoryRepository xategoryRepository;

    public int insert(CategoryEntity category) {
        //entityManager.persist(category);

        xategoryRepository.save(category);
        return category.getCategoryId();
    }


    public Optional<CategoryEntity> findById(int id) {
        return xategoryRepository.findById(id);
        //return entityManager.find(CategoryEntity.class, id);
    }

    public List<CategoryEntity> findAll() {
        //Query query = entityManager.createNamedQuery("Category.add",CategoryEntity.class);
        return findAll();
    }

        //Implemented already
   /* public void addCategory(CategoryEntity categoryNew){
        categoryDAO.addCategory(categoryNew);
    }*/


    public void updateCategory(int  id,CategoryEntity category){

        xategoryRepository.save(category);
    }

    public void deleteCategory(int  id){

        xategoryRepository.deleteById(id);
    }


}
