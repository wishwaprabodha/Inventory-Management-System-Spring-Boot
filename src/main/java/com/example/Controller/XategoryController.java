package com.example.Controller;

import com.example.Entity.CategoryEntity;
import com.example.Service.XategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 *Created by Wishwa Prabodha on 3/27/2018.
 */


@RestController
@RequestMapping("/categories")
public class XategoryController {

@Autowired
public XategoryService xategoryService;


   /* @RequestMapping("")
    public List<CategoryEntity> getAllCategory() {

        //return categoryService.getAllCategoryList();
        return categoryService.findAll();
    }*/


    @RequestMapping("/{id}")
    public Optional<CategoryEntity> searchCategory(@PathVariable int  id){
        //return categoryService.searchCategory(id);
        return xategoryService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "")
    public void addCategory(@RequestBody CategoryEntity category) {

        //categoryService.addCategory(category);
        xategoryService.insert(category);
    }

    @RequestMapping("/update/{id}")
    public void updateCategory(@RequestBody CategoryEntity category,@PathVariable int categoryId) {
        xategoryService.updateCategory(categoryId,category);
    }

    @RequestMapping("/delete/{id}")
    public void deleteCategory(int categoryId) {
        xategoryService.deleteCategory(categoryId);
    }


}
