package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.HomeDecor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HomeDecorRepository extends MongoRepository<HomeDecor, String>
{

}
