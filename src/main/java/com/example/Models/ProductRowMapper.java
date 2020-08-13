package com.example.Models;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product>{

    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductId(resultSet.getString("productId"));
        product.setProductName(resultSet.getString("productName"));
        product.setPrice(resultSet.getInt("price"));
        product.setProductDesc(resultSet.getString("product_desc"));
        return product;
    }
}
