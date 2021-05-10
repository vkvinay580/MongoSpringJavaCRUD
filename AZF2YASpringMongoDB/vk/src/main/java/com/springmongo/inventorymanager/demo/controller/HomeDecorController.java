package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.HomeDecor;
import com.springmongo.inventorymanager.demo.repository.HomeDecorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("HomeDecor")
public class HomeDecorController  {
    @Autowired
    private HomeDecorRepository repository;
    @PostMapping("/addHomeDecor")
    public String saveHomeDecor(@RequestBody HomeDecor HomeDecor)
    {
        repository.save(HomeDecor);
        return "Brand  Added with id"+HomeDecor.getId();
    }
    @GetMapping("/findAllHomeDecor")
    public List<HomeDecor> getHomeDecor()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllHomeDecor/{id}")
    public Optional<HomeDecor> getHomeDecor(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteHomeDecor(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
