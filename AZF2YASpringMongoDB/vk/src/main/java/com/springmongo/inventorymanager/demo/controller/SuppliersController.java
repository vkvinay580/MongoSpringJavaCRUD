package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Suppliers;
import com.springmongo.inventorymanager.demo.repository.SuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Suppliers")
public class SuppliersController  {
    @Autowired
    private SuppliersRepository repository;
    @PostMapping("/addSuppliers")
    public String saveSuppliers(@RequestBody Suppliers Suppliers)
    {
        repository.save(Suppliers);
        return "Brand  Added with id"+Suppliers.getId();
    }
    @GetMapping("/findAllSuppliers")
    public List<Suppliers> getSuppliers()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllSuppliers/{id}")
    public Optional<Suppliers> getSuppliers(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteSuppliers(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
