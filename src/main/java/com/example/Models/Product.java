package com.example.Models;

import com.sun.istack.NotNull;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    private String productId;

    @NotNull
    private String productName;

    @NotNull
    private Integer price;
    private String productDesc;

    public Product() {
    }

    public Product(String productName, String productId, Integer price, String productDesc) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.productDesc = productDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

}
