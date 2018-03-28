package com.example.Service;

import com.example.DAO.PricingDAO;
import com.example.Entity.PricingEntity;
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

    public int insert(PricingEntity pricing) {
        entityManager.persist(pricing);
        return pricing.getPricingId();
    }


    public PricingEntity find(int  id) {
        return entityManager.find(PricingEntity.class, id);
    }

    public List<PricingEntity> findAll() {
        Query query = entityManager.createNamedQuery("Pricing.add",PricingEntity.class);
        return query.getResultList();
    }

    public void addPricing(PricingEntity pricingNew){
        pricingDAO.save(pricingNew);
    }

    public Optional<PricingEntity> searchPricing(int  id){
        return pricingDAO.findById(id);
    }

    public void updatePricing(int  id,PricingEntity pricing){
        pricingDAO.save(pricing);
    }

    public void deletePricing(int  id){
        pricingDAO.deleteById(id);
    }

    public List<PricingEntity> getByName(String name){return pricingDAO.getAllByName(name); }


}
