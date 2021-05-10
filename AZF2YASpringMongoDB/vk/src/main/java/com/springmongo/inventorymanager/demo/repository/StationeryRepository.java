package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.Stationery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StationeryRepository extends MongoRepository<Stationery, String>
{

}
