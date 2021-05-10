package com.springmongo.inventorymanager.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Cart")
public class Cart
{
    @Id
    private String id;
    private String name;
    private String orderplacedon;
    private String paymentstatus;
    private String value;
    private String email;
    private String address;
}
