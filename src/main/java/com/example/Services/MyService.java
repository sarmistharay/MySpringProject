package com.example.Services;

import com.example.Models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class MyService {
    /*private static List<Product> productData = new ArrayList<Product>();

    static{
        productData.add(new Product("Pen", "Product1",2, "Writing Pen" ));
        productData.add(new Product("Sketch Book", "Product2",12, "Sketch Book for Drawing" ));
        productData.add(new Product("Construction Paper", "Product3",10, "Construction Paper for Craft" ));
    }

    public List<Product> retrieveAllProduct(){
        return productData;
    }

    public Product retrieveOneProduct(String productId){
        String tempNum ="";
        for(Product prod : productData){
            tempNum = prod.getProductNum();
            if(tempNum.equals(productId)){
                return prod;
            }
        }
        return null;
    }

    public Product addProductToList(Product prod) {
        productData.add(prod);
        return prod;
    }
*/}
