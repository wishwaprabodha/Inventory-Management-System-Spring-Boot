package com.example.Service;

import com.example.Repository.PricingRepository;
import com.example.Entity.PricingEntity;
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



    public int insert(PricingEntity pricing) {
        pricingRepository.save(pricing);
        return pricing.getPricingId();
    }


    public Optional<PricingEntity> find(int  id) {
        return pricingRepository.findById(id);
        //return entityManager.find(PricingEntity.class, id);
    }

   /* public List<PricingEntity> findAll() {
        Query query = entityManager.createNamedQuery("Pricing.add",PricingEntity.class);
        return query.getResultList();
    }*/

  /*  public void addPricing(PricingEntity pricingNew){

        pricingRepository.save(pricingNew;
    }*/

   /* public Optional<PricingEntity> searchPricing(int  id){

        return pricingRepository.findById(id);
    }*/
        //
    public void updatePricing(PricingEntity pricing){
        pricingRepository.save(pricing);
    }

    public void deletePricing(int  id){

        pricingRepository.deleteById(id);
    }



}
