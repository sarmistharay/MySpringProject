package com.example.Services;

import com.example.Models.Product;
import com.example.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    /*ProductDao productDao;

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productDao.getAllProducts();
        return products;
    }

    @Override
    public void insertProduct(Product product) {
        productDao.insertProduct(product);
    }

    @Override
    public Product getOneProduct(String productId){
        return productDao.getOneProduct(productId);
    }*/
    @Autowired
    ProductRepository productRepos;

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepos.getAllProduct();
    }

    @Override
   public void insertProduct(Product product) {
        productRepos.insertProduct(product);
    }

    @Override
    public Product getOneProduct(String productId) {
        return productRepos.getProductById(productId);
    }

    @Override
    public void updateProduct(Product product) {
        productRepos.updateProduct(product);
    }

    @Override
    public void deleteProduct(String productId) {
        productRepos.deleteProduct(productId);
    }
}
