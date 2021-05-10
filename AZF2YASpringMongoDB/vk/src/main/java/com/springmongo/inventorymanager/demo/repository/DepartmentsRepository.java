package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentsRepository extends MongoRepository<Departments, String>
{

}
