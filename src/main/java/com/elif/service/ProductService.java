package com.elif.service;

import com.elif.dao.ProductDao;
import com.elif.model.Product;

import java.util.List;

public class ProductService {
    private final ProductDao productDao;

    public ProductService(ProductDao productDao){
        this.productDao = productDao;
    }
    public Product saveProduct(String name, String description, double price){
        Product product = new Product(name, description, price);
        return productDao.saveProduct(product);
    }

    public void deleteProduct(int id){
        productDao.deleteProduct(id);
    }

    public void updateProduct(int id, String name, String description, double price){
        Product updatePr = new Product(name, description, price);
        updatePr.setId(id);
        productDao.updateProduct(updatePr);
    }

    public List<Product> listProducts(){
        return productDao.getAll();
    }
}
