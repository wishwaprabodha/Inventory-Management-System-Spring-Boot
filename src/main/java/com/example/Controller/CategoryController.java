package com.example.Controller;

import com.example.Entity.CategoryEntity;
import com.example.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;


   /* @RequestMapping("")
    public List<CategoryEntity> getAllCategory() {

        //return categoryService.getAllCategoryList();
        return categoryService.findAll();
    }*/


    @RequestMapping("/{id}")
    public Optional<CategoryEntity> searchCategory(@PathVariable int id) {
        //return categoryService.searchCategory(id);
        return categoryService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addCategory(@RequestBody CategoryEntity category) {

        //categoryService.addCategory(category);
        categoryService.insert(category);
    }

    @RequestMapping("/update/{id}")
    public void updateCategory(@RequestBody CategoryEntity category, @PathVariable int categoryId) {
        categoryService.updateCategory(categoryId, category);
    }

    @RequestMapping("/delete/{id}")
    public void deleteCategory(int categoryId) {
        categoryService.deleteCategory(categoryId);
    }


}
