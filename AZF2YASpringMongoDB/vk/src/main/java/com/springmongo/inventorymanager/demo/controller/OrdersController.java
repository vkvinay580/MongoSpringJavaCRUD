package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Orders;
import com.springmongo.inventorymanager.demo.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Orders")
public class OrdersController  {
    @Autowired
    private OrdersRepository repository;
    @PostMapping("/addOrders")
    public String saveOrders(@RequestBody Orders Orders)
    {
        repository.save(Orders);
        return "Brand  Added with id"+Orders.getId();
    }
    @GetMapping("/findAllOrders")
    public List<Orders> getOrders()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllOrders/{id}")
    public Optional<Orders> getOrders(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrders(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
