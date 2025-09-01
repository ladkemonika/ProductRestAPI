package com.Product.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.Product.entity.Product;


public interface ProductService {
    
	Product createProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}

