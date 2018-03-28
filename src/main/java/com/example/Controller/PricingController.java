package com.example.Controller;

import com.example.Entity.Pricing;
import com.example.Service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */

/**
 * Because of the Business Entity confliction we have to consider that pricing
        happens on each product wise and not generalized for entities.
*/

@RestController
@RequestMapping("/categories/{id}/products/{id}")
public class PricingController {


    @Autowired
    public PricingService pricingService;


    @RequestMapping("")
    public List<Pricing> getAllPricing() {

        //return pricingService.getAllCategoryList();
        return pricingService.findAll();
    }


    @RequestMapping("/pricings/{id}")
    public Pricing searchPricing(@PathVariable int  id){
        //return categoryService.searchCategory(id);
        return pricingService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "")
    public void addPricing(@RequestBody Pricing  pricing) {

        //categoryService.addCategory(category);
        pricingService.insert( pricing);
    }

    @RequestMapping("/pricings/update/{id}")
    public void updateCategory(@RequestBody Pricing  pricing,@PathVariable int  pricingId) {
        pricingService.updatePricing( pricingId, pricing);
    }

    @RequestMapping("/pricings/delete/{id}")
    public void deletePricing(int  pricingId) {
        pricingService.deletePricing( pricingId);
    }


}

