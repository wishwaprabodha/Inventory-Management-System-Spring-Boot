package com.example.DAO;

import com.example.Entity.Pricing;
import com.example.Entity.PricingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */
@Repository
public interface PricingDAO extends JpaRepository<PricingEntity,Integer> {

    List<PricingEntity> getAllByName(String name);
}
