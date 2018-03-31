package com.example.Controller;

import com.example.Entity.PricingEntity;
import com.example.Service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */

/**
 * Because of the Business Entity confliction we have to consider that pricing
 * happens on each product wise and not generalized for entities.
 */

@RestController
@RequestMapping("/categories/{id}/products/{id}")
public class PricingController {


    @Autowired
    public PricingService pricingService;


   /* @RequestMapping("")
    public List<PricingEntity> getAllPricing() {

        //return pricingService.getAllCategoryList();
        return pricingService.findAll();
    }*/


    @RequestMapping("/pricings/{id}")
    public Optional<PricingEntity> searchPricing(@PathVariable int id) {
        //return categoryService.searchCategory(id);
        return pricingService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addPricing(@RequestBody PricingEntity pricing) {

        //categoryService.addCategory(category);
        pricingService.insert(pricing);
    }

    @RequestMapping("/pricings/update/{id}")
    public void updateCategory(@RequestBody PricingEntity pricing) {
        pricingService.updatePricing(pricing);
    }

    @RequestMapping("/pricings/delete/{id}")
    public void deletePricing(int pricingId) {
        pricingService.deletePricing(pricingId);
    }


}

