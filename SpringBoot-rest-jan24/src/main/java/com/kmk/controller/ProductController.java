package com.kmk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kmk.entity.Product;
import com.kmk.exception.ProductNotFoundExcepption;
import com.kmk.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	@GetMapping("/getAllProducts")
	public List<Product> getAllProduct() {
		return productService.getAllProducts();
	}
	@GetMapping("/getProduct/{id}")
	public Product getProduct(@PathVariable Long id) throws ProductNotFoundExcepption {
		return productService.getProduct(id);
	}
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	@GetMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
}
