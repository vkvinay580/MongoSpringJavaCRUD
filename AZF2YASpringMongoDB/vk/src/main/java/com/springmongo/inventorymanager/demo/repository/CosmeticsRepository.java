package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.Cosmetics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CosmeticsRepository extends MongoRepository<Cosmetics, String>
{

}
