package com.example.spring_elastic_search.repo;

import com.example.spring_elastic_search.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {

}
