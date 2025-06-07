package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductEntity;
import com.product.service.ProductService;

@RestController
@RequestMapping("/prod")
public class ProductController 
{

	@Autowired
	ProductService service;
	//add product
	@PostMapping
	public ProductEntity addProd(@RequestBody ProductEntity prod)
	{
		return service.addProduct(prod);
	}
	//get by id
	@GetMapping("/{id}")
	public ProductEntity getById(@PathVariable Long id)
	{
		return service.getProductById(id);
	}
	//get all
	@GetMapping
	public List<ProductEntity> getAllProduct()
	{
		return service.getAllProduct();
	}
	//update by id
	@PutMapping("/{id}")
	public ProductEntity updateProduct(@PathVariable Long id,@RequestBody ProductEntity prod)
	{
		return service.updateProduct(id, prod);
	}
	//delete by id
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable Long id)
	{
		return service.deleteById(id);
	}
}
