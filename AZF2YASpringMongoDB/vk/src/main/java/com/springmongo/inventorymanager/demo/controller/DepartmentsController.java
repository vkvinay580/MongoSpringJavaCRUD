package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Departments;
import com.springmongo.inventorymanager.demo.repository.DepartmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Departments")
public class DepartmentsController  {
    @Autowired
    private DepartmentsRepository repository;
    @PostMapping("/addDepartments")
    public String saveDepartments(@RequestBody Departments Departments)
    {
        repository.save(Departments);
        return "Brand  Added with id"+Departments.getId();
    }
    @GetMapping("/findAllDepartments")
    public List<Departments> getDepartments()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllDepartments/{id}")
    public Optional<Departments> getDepartments(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteDepartments(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
