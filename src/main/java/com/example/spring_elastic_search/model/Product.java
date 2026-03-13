package com.example.spring_elastic_search.model;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "products")
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private double price;


}

