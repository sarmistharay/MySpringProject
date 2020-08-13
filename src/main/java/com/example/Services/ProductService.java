package com.example.Services;

import com.example.Models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void insertProduct(Product product);
    Product getOneProduct(String productId);
    void updateProduct(Product product);
    void deleteProduct(String productId);
}
