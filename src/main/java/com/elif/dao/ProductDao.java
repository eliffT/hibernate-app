package com.elif.dao;

import com.elif.model.Product;

import java.util.List;

public interface ProductDao {
    Product saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> getAll();
}
