package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.StoreInventory;
import com.springmongo.inventorymanager.demo.repository.StoreInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("StoreInventory")
public class StoreInventoryController  {
    @Autowired
    private StoreInventoryRepository repository;
    @PostMapping("/addStoreInventory")
    public String saveStoreInventory(@RequestBody StoreInventory StoreInventory)
    {
        repository.save(StoreInventory);
        return "Brand  Added with id"+StoreInventory.getId();
    }
    @GetMapping("/findAllStoreInventory")
    public List<StoreInventory> getStoreInventory()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllStoreInventory/{id}")
    public Optional<StoreInventory> getStoreInventory(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStoreInventory(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
