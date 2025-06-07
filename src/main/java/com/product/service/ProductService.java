package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.ProductEntity;
import com.product.repository.ProductRepository;

@Service
public class ProductService
{

    
	@Autowired
	private ProductRepository proRepo;

   
	//add product
	public ProductEntity addProduct(ProductEntity prod)
	{
		return proRepo.save(prod);
	}
	//get product by id
	public ProductEntity getProductById(Long id)
	{
		return proRepo.findById(id).orElse(null);
	}
	//get all product
	public List<ProductEntity> getAllProduct()
	{
		return proRepo.findAll();
	}
	//update product by id
	public ProductEntity updateProduct(Long id,ProductEntity prod)
	{
		Optional<ProductEntity> byId = proRepo.findById(id);
		if(byId.isPresent())
		{
			ProductEntity existingProduct = byId.get();
			existingProduct.setName(prod.getName());
			existingProduct.setPrice(prod.getPrice());
			existingProduct.setQuantity(prod.getQuantity());
			return proRepo.save(existingProduct);
		}
		return null;
	}
	//delete by id
	public String deleteById(Long id)
	{
		Optional<ProductEntity> byId = proRepo.findById(id);
		if(byId.isPresent())
		{
			ProductEntity pro = byId.get();
			String name = pro.getName();
			proRepo.deleteById(id);
			return name+" is deleted successfully";
		}
		return "No product found";
	}
	
}
