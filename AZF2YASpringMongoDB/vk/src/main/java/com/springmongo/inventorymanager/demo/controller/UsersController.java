package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Users;
import com.springmongo.inventorymanager.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Users")
public class UsersController  {
    @Autowired
    private UsersRepository repository;
    @PostMapping("/addUsers")
    public String saveUsers(@RequestBody Users Users)
    {
        repository.save(Users);
        return "Brand  Added with id"+Users.getId();
    }
    @GetMapping("/findAllUsers")
    public List<Users> getUsers()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllUsers/{id}")
    public Optional<Users> getUsers(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUsers(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
