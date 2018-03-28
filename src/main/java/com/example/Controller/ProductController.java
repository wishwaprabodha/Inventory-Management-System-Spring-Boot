package com.example.Controller;

import com.example.Entity.CategoryEntity;
import com.example.Entity.ProductEntity;
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
    public List<ProductEntity> getAllProducts() {

        //return productService.getAllProductList();
        return productService.findAll();
    }


    @RequestMapping("/{id}")
    public ProductEntity searchProduct(@PathVariable int  id){
        //return productService.searchProduct(id);
        return productService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "")
    public void addProduct(@RequestBody ProductEntity product,@RequestBody CategoryEntity category) {

        //productService.addProduct(product);
        product.setCategoryByCategoryId(category);
        productService.insert(product);
        }

    @RequestMapping("/update/{id}")
    public void updateProduct(@RequestBody ProductEntity product,@PathVariable int produtId) {
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
