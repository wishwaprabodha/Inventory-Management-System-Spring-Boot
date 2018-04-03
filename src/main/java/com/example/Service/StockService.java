package com.example.Service;

import com.example.Entity.StockEntity;
import com.example.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public int insert(StockEntity stock) {
        //entityManager.persist(category);

        stockRepository.save(stock);
        return stock.getCategoryId();
    }


    public Optional<StockEntity> findById(int id) {
        return stockRepository.findById(id);
        //return entityManager.find(CategoryEntity.class, id);
    }

    public Iterable<StockEntity> findAll() {
        //Query query = entityManager.createNamedQuery("Category.add",CategoryEntity.class);
        return stockRepository.findAll();
    }

    //Implemented already
   /* public void addCategory(CategoryEntity categoryNew){
        categoryDAO.addCategory(categoryNew);
    }*/


    public void updateStock(int id, StockEntity stock) {

        stockRepository.save(stock);
    }

    public void deleteStock(int id) {

        stockRepository.deleteById(id);
    }


}
