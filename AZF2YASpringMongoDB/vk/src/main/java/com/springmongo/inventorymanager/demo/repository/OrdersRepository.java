package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<Orders, String>
{

}
