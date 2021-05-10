package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.Electronics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ElectronicsRepository extends MongoRepository<Electronics, String>
{

}
