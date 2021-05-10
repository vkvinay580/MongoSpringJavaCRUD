package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Cosmetics;
import com.springmongo.inventorymanager.demo.repository.CosmeticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Cosmetics")
public class CosmeticsController  {
    @Autowired
    private CosmeticsRepository repository;
    @PostMapping("/addCosmetics")
    public String saveCosmetics(@RequestBody Cosmetics Cosmetics)
    {
        repository.save(Cosmetics);
        return "Brand  Added with id"+Cosmetics.getId();
    }
    @GetMapping("/findAllCosmetics")
    public List<Cosmetics> getCosmetics()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllCosmetics/{id}")
    public Optional<Cosmetics> getCosmetics(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCosmetics(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
