package com.example.Controller;

import com.example.Entity.Product;
import com.example.Service.ProductService;
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

   /* @RequestMapping("")
    public List<Product> getAllProducts() {

        //return productService.getAllProductList();
        return productService.findAll();
    }*/


    @RequestMapping("/{id}")
    public Optional<Product> searchProduct(@PathVariable int id) {
        //return productService.searchProduct(id);
        return productService.find(id);
    }

    // ToDo: Cant map request body with two entities (Product and Category)
//    @RequestMapping(method = RequestMethod.POST, value = "")
//    public void addProduct(@RequestBody Product product, @RequestBody Category category) {
//
//        //productService.addProduct(product);
//        product.setCategoryByCategoryId(category);
//        productService.insert(product);
//    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteProduct(int productId) {
        productService.deleteProduct(productId);
    }

  /*  @RequestMapping("/product/update/{id}")
    public void updateProduct(@PathVariable int id,@RequestBody Product product){
        productService.updateProduct(id,product);
    }

    @RequestMapping("/product/delete")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }

    @RequestMapping("/product/{name}")
    public List<Product> getByName(@PathVariable String name){return productService.getByName(name); }

*/
}
