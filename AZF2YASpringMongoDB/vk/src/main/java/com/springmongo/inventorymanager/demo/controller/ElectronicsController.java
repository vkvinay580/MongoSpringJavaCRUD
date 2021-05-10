package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Electronics;
import com.springmongo.inventorymanager.demo.repository.ElectronicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Electronics")
public class ElectronicsController  {
    @Autowired
    private ElectronicsRepository repository;
    @PostMapping("/addElectronics")
    public String saveElectronics(@RequestBody Electronics Electronics)
    {
        repository.save(Electronics);
        return "Brand  Added with id"+Electronics.getId();
    }
    @GetMapping("/findAllElectronics")
    public List<Electronics> getElectronics()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllElectronics/{id}")
    public Optional<Electronics> getElectronics(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteElectronics(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
