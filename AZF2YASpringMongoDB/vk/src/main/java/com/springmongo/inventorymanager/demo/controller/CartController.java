package com.springmongo.inventorymanager.demo.controller;

import com.springmongo.inventorymanager.demo.model.Cart;
import com.springmongo.inventorymanager.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Cart")
public class CartController  {
    @Autowired
    private CartRepository repository;
    @PostMapping("/addCart")
    public String saveCart(@RequestBody Cart Cart)
    {
        repository.save(Cart);
        return "Brand  Added with id"+Cart.getId();
    }
    @GetMapping("/findAllCart")
    public List<Cart> getCart()
    {
        return repository.findAll();
    }
    @GetMapping("/findAllCart/{id}")
    public Optional<Cart> getCart(@PathVariable String id)
    {
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCart(@PathVariable String id)
    {
        repository.deleteById(id);
        return "Brand Deleted with id"+id;
    }
}
