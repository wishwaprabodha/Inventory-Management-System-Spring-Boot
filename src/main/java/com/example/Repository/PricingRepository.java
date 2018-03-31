package com.example.Repository;

import com.example.Entity.PricingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */
@Repository
public interface PricingRepository extends CrudRepository<PricingEntity,Integer>{


}
