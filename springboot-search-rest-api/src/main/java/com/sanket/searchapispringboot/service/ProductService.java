package com.sanket.searchapispringboot.service;

import com.sanket.searchapispringboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
