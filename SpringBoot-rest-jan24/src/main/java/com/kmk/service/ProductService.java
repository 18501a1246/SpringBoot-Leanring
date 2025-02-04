package com.kmk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmk.entity.Product;
import com.kmk.exception.ProductNotFoundExcepption;
import com.kmk.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public
	Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Transactional
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Transactional
	public void deleteProduct(Long id) {
		 productRepository.deleteById(id);
	}
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	public Product getProduct(Long id) throws ProductNotFoundExcepption {
		Optional<Product> optProduct = productRepository.findById(id);
		if(optProduct.isPresent()) return optProduct.get();
		throw new ProductNotFoundExcepption("Product is not found");
		
	}
}
