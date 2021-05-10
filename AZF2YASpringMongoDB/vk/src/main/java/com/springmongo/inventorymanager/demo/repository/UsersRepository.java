package com.springmongo.inventorymanager.demo.repository;

import com.springmongo.inventorymanager.demo.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String>
{

}
