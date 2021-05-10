package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.StoreInventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreInventoryRepository extends MongoRepository<StoreInventory, String>
{

}
