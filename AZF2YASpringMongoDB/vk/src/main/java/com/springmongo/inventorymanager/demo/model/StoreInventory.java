package com.springmongo.inventorymanager.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "StoreInventory")
public class StoreInventory
{
    @Id
    private String id;
    private String name;
    private String price;
    private String quantity;
    private String department;
    private String supplier;
    private String brand;
}
