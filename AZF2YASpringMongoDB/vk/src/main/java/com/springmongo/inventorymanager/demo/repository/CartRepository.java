package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, String>
{

}
