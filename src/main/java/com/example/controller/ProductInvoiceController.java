package com.example.controller;

import com.example.entity.ProductInvoice;
import com.example.service.ProductInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/productinvoice")
public class ProductInvoiceController {
    @Autowired
    private ProductInvoiceService productInvoiceService;

    @RequestMapping("")
    public Iterable<ProductInvoice> getAllProductInvoice() {
        return productInvoiceService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<ProductInvoice> searchProductInvoice(@PathVariable int id) {
        return productInvoiceService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addProductInvoice(@RequestBody ProductInvoice productInvoice) {
        productInvoiceService.insert(productInvoice);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateProductInvoice(@RequestBody ProductInvoice productInvoice) {
        productInvoiceService.updateProductInvoice(productInvoice);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteProductInvoice(@RequestBody ProductInvoice productInvoice) {
        productInvoiceService.deleteProductInvoice(productInvoice);
    }

}
