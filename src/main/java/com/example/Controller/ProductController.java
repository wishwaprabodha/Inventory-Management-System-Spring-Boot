package com.example.Controller;

import com.example.Entity.Category;
import com.example.Entity.Product;
import com.example.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */

@RestController
@RequestMapping("categories/{id}/products")
public class ProductController {


    @Autowired
    public ProductService productService;

    @RequestMapping("")
    public List<Product> getAllProducts() {

        //return productService.getAllProductList();
        return productService.findAll();
    }


    @RequestMapping("/{id}")
    public Product searchProduct(@PathVariable int  id){
        //return productService.searchProduct(id);
        return productService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "")
    public void addProduct(@RequestBody Product product,@RequestBody Category category) {

        //productService.addProduct(product);
        product.setCategory(category);
        productService.insert(product);
        }

    @RequestMapping("/update/{id}")
    public void updateProduct(@RequestBody Product product,@PathVariable int produtId) {
        productService.updateProduct(produtId,product);
    }

    @RequestMapping("/delete/{id}")
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
