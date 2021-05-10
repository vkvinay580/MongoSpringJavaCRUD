package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.Brands;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BrandsRepository extends MongoRepository<Brands, String>
{

}
