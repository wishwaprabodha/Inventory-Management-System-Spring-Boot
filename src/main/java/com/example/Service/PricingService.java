package com.example.Service;

import com.example.Entity.Pricing;
import com.example.Repository.PricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */

@Transactional
@Service
public class PricingService {

    @Autowired
    private PricingRepository pricingRepository;


    public int insert(Pricing pricing) {
        pricingRepository.save(pricing);
        return pricing.getPricingId();
    }


    public Optional<Pricing> find(int id) {
        return pricingRepository.findById(id);
        //return entityManager.find(Pricing.class, id);
    }

   /* public List<Pricing> findAll() {
        Query query = entityManager.createNamedQuery("Pricing.add",Pricing.class);
        return query.getResultList();
    }*/

  /*  public void addPricing(Pricing pricingNew){

        pricingRepository.save(pricingNew;
    }*/

    /* public Optional<Pricing> searchPricing(int  id){

         return pricingRepository.findById(id);
     }*/
    //
    public void updatePricing(Pricing pricing) {
        pricingRepository.save(pricing);
    }

    public void deletePricing(int id) {

        pricingRepository.deleteById(id);
    }


}
