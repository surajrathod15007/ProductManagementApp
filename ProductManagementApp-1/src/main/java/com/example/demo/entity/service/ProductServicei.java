package com.example.demo.entity.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductServicei 
{
   public void addProduct();
   public List<Product> viewProducts();
   public String updateProduct();
   public String deleteProduct();
}
