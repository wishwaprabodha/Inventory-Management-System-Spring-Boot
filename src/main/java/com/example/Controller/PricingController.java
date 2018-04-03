package com.example.Controller;

import com.example.Entity.Pricing;
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

    @RequestMapping("/pricings/{id}")
    public Optional<Pricing> searchPricing(@PathVariable int id) {
        return pricingService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addPricing(@RequestBody Pricing pricing) {
        pricingService.insert(pricing);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Pricing pricing) {
        pricingService.updatePricing(pricing);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deletePricing(@RequestBody Pricing pricing) {
        pricingService.deletePricing(pricing);
    }


}

