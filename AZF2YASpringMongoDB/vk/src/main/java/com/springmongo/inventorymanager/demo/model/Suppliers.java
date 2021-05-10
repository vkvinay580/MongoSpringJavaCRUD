package com.springmongo.inventorymanager.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Suppliers")
public class Suppliers
{
    @Id
    private String id;
    private String name;
    private String phone;
    private String supplierid;
    private String address;
}

