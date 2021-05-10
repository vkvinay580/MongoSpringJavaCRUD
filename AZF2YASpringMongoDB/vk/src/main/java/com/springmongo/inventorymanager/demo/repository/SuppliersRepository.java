package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.Suppliers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SuppliersRepository extends MongoRepository<Suppliers, String>
{

}
