package com.springmongo.inventorymanager.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString

@Document(collection = "Departments")
public class Departments
{
    @Id
    private String id;
    private String Name;
    private List Brands;
}
