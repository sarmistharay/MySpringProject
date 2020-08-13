package com.example.Controller;

import com.example.Models.Product;
import com.example.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class MyController {

    @Autowired
    ProductService prodService;

    @GetMapping(path="/all", produces = "application/json")
    public List<Product> getAllProduct(){
        return prodService.getAllProducts();
    }

    @GetMapping(path="/one", produces = "application/json")
    public Product getTheProduct(@RequestParam(value = "id", required = true) String productId){
        return prodService.getOneProduct(productId);
    }

    @PostMapping(path="/insert", consumes = "application/json")
    public void addProduct(@RequestBody Product product){
        prodService.insertProduct(product);
    }

    @PutMapping(path="/update", consumes = "application/json")
    public void updateProduct(@RequestBody Product product){
        prodService.updateProduct(product);
    }

    @DeleteMapping(path="/delete", consumes = "application/json")
    public void deleteProduct(@RequestParam(value = "id", required = true) String productId){
        prodService.deleteProduct(productId);
    }
}
