package com.example.controller;


import com.example.entity.ProductPricing;
import com.example.service.ProductPricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/productpricing")
public class ProductPricingController {

    @Autowired
    private ProductPricingService productPricingService;

    @RequestMapping("")
    public Iterable<ProductPricing> getAllProductPricing() {
        return productPricingService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<ProductPricing> searchProductPricing(@PathVariable int id) {
        return productPricingService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addProductPricing(@RequestBody ProductPricing productPricing) {
        productPricingService.insert(productPricing);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateProductPricing(@RequestBody ProductPricing productPricing) {
        productPricingService.updateProductPricing(productPricing);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteProductPricing(@RequestBody ProductPricing productPricing) {
        productPricingService.deleteProductPricing(productPricing);
    }

}
