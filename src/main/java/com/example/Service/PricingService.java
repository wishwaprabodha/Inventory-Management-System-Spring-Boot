package com.example.Service;

import com.example.Entity.Pricing;
import com.example.DAO.PricingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */
@Repository
@Transactional
public class PricingService {

    @Autowired
    private PricingDAO pricingDAO;

    @PersistenceContext
    private EntityManager entityManager;

    public int insert(Pricing pricing) {
        entityManager.persist(pricing);
        return pricing.getPricingId();
    }


    public Pricing find(int  id) {
        return entityManager.find(Pricing.class, id);
    }

    public List<Pricing> findAll() {
        Query query = entityManager.createNamedQuery("Pricing.add",Pricing.class);
        return query.getResultList();
    }

    public void addPricing(Pricing categoryNew){
        pricingDAO.save(categoryNew);
    }

    public Optional<Pricing> searchPricing(int  id){
        return pricingDAO.findById(id);
    }

    public void updatePricing(int  id,Pricing category){
        pricingDAO.save(category);
    }

    public void deletePricing(int  id){
        pricingDAO.deleteById(id);
    }

    public List<Pricing> getByName(String name){return pricingDAO.getAllByName(name); }


}
