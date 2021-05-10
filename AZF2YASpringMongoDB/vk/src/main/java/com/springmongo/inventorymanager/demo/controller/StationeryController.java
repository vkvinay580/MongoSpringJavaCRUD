package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Stationery;
import com.springmongo.inventorymanager.demo.repository.StationeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Stationery")
public class StationeryController  {
    @Autowired
    private StationeryRepository repository;
    @PostMapping("/addStationery")
    public String saveStationery(@RequestBody Stationery Stationery)
    {
        repository.save(Stationery);
        return "Brand  Added with id"+Stationery.getId();
    }
    @GetMapping("/findAllStationery")
    public List<Stationery> getStationery()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllStationery/{id}")
    public Optional<Stationery> getStationery(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStationery(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
