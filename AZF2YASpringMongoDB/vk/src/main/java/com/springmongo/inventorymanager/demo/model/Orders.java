package com.springmongo.inventorymanager.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Orders")
public class Orders
{
    @Id
    private String id;
    private String Name;
    private String Address;
    private String Email;
    private String OrderPlacedOn;
    private String PaymentStatus;
    private String SaleId;
    private String Value;
    private String Users;
}
