package com.example.Repository;

import com.example.Models.Product;
import com.example.Models.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getAllProduct(){
        List<Product> productList = new ArrayList<Product>();
        String getProductSql = "SELECT * FROM product;";
        productList.addAll(jdbcTemplate.query(getProductSql,new ProductRowMapper()));
        return productList;
    }

    public Product getProductById(String productId){
        String getProductByIdSql = "SELECT * FROM product WHERE productId = ?;";
        Product product;
        product = jdbcTemplate.queryForObject(getProductByIdSql, new ProductRowMapper(), productId);
        return product;
    }

    public void insertProduct(Product product) {
        String insertProductSql = "INSERT INTO product(productId, productName, price, product_desc) VALUES(?,?,?,?)";
        int result = jdbcTemplate.update(insertProductSql,product.getProductId(), product.getProductName(), product.getPrice(), product.getProductDesc());
        if(result == 1){
            System.out.println("Product is created..");
        }
    }

    public void updateProduct(Product product) {
        String updateProductSql = "UPDATE product SET productName=?, price=?, product_desc=? WHERE productId = ?";
        int result = jdbcTemplate.update(updateProductSql, product.getProductName(), product.getPrice(), product.getProductDesc(), product.getProductId());
        if(result == 1){
            System.out.println("Product is updated..");
        }
    }

    public void deleteProduct(String productId) {
        String deleteProductSql = "DELETE FROM product WHERE productId = ?";
        int result = jdbcTemplate.update(deleteProductSql, productId);
        if(result == 1){
            System.out.println("Product is deleted..");
        }
    }
}
