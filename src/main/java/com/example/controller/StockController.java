package com.example.controller;

import com.example.entity.Stock;
import com.example.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    @RequestMapping("")
    public Iterable<Stock> getAllStock() {
        return stockService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Stock> searchStock(@PathVariable int id) {
        return stockService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addStock(@RequestBody Stock stock) {
        stockService.insert(stock);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateStock(@RequestBody Stock stock) {
        stockService.updateStock(stock);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteStock(@RequestBody Stock stock) {
        stockService.deleteStock(stock);
    }

}
