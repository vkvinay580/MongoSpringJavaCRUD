package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Brands;
import com.springmongo.inventorymanager.demo.repository.BrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Brands")
public class BrandsController  {
    @Autowired
    private BrandsRepository repository;
    @PostMapping("/addBrands")
    public String saveBrands(@RequestBody Brands brands)
    {
        repository.save(brands);
        return "Brand  Added with id"+brands.getId();
    }
    @GetMapping("/findAllBrands")
    public List<Brands> getBrands()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllBrands/{id}")
    public Optional<Brands> getBrands(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBrands(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
