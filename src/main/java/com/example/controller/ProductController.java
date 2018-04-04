package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */

@RestController
@RequestMapping("categories/{id}/products")
public class ProductController {


    @Autowired
    public ProductService productService;


    @RequestMapping("")
    public Iterable<Product> getAllProducts() {
        return productService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Product> searchProduct(@PathVariable int id) {
        return productService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addProduct(@RequestBody Product product) {
        productService.insert(product);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
    }


}
