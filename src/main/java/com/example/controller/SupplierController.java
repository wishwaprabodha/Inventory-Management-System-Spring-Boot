package com.example.controller;


import com.example.entity.Supplier;
import com.example.entity.TheLogConverter;
import com.example.service.SupplierLogService;
import com.example.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;
    @Autowired
    private SupplierLogService supplierLogService;

    @RequestMapping("")
    public Iterable<Supplier> getAllSupplier() {
        return supplierService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Supplier> searchSupplier(@PathVariable int id) {
        return supplierService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addCategory(@RequestBody Supplier supplier) {
        supplierService.insert(supplier);
        supplierLogService.insert(TheLogConverter.supplierLogConverter(supplier));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Supplier supplier) {
        supplierService.updateSupplier(supplier);
        supplierLogService.insert(TheLogConverter.supplierLogConverter(supplier));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteCategory(@RequestBody Supplier supplier) {
        supplierService.deleteSupplier(supplier);
        supplierLogService.insert(TheLogConverter.supplierLogConverter(supplier));
    }



}
