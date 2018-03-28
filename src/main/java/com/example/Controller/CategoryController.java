package com.example.Controller;

import com.example.Entity.Category;
import com.example.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *Created by Wishwa Prabodha on 3/27/2018.
 */


@RestController
@RequestMapping("/categories")
public class CategoryController{

@Autowired
public CategoryService categoryService;


    @RequestMapping("")
    public List<Category> getAllCategory() {

        //return categoryService.getAllCategoryList();
        return categoryService.findAll();
    }


    @RequestMapping("/categories/{id}")
    public Category searchCategory(@PathVariable int  id){
        //return categoryService.searchCategory(id);
        return categoryService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "")
    public void addCategory(@RequestBody Category category) {

        //categoryService.addCategory(category);
        categoryService.insert(category);
    }

    @RequestMapping("/categories/update/{id}")
    public void updateCategory(@RequestBody Category category,@PathVariable int categoryId) {
        categoryService.updateCategory(categoryId,category);
    }

    @RequestMapping("/categories/delete/{id}")
    public void deleteCategory(int categoryId) {
        categoryService.deleteCategory(categoryId);
    }


}
