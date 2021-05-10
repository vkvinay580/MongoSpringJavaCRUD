package com.springmongo.inventorymanager.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Users")
public class Users
{
    @Id
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String userid;
}
