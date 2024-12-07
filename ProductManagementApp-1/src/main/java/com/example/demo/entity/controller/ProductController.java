package com.example.demo.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.service.ProductService;

@Controller
public class ProductController 
{
   @Autowired	
   ProductService pr;	
	
   @GetMapping("/")	
   public String openIndex()
   {
	 return "addProduct";  
   }
   
   
}
