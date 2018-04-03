package com.example.Service;

import com.example.Entity.Category;
import com.example.Entity.Stock;
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

    public Category insert(Stock stock) {
        //entityManager.persist(category);

        stockRepository.save(stock);
        return stock.getCategory();
    }


    public Optional<Stock> findById(int id) {
        return stockRepository.findById(id);
        //return entityManager.find(Category.class, id);
    }

    public Iterable<Stock> findAll() {
        //Query query = entityManager.createNamedQuery("Category.add",Category.class);
        return stockRepository.findAll();
    }

    //Implemented already
   /* public void addCategory(Category categoryNew){
        categoryDAO.addCategory(categoryNew);
    }*/


    public void updateStock(int id, Stock stock) {

        stockRepository.save(stock);
    }

    public void deleteStock(int id) {

        stockRepository.deleteById(id);
    }


}
