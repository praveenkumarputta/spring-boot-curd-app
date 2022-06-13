package com.praveenp.application.controller;

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

import com.praveenp.application.entity.Product;
import com.praveenp.application.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/addProduct")
	public Product addproduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> addproducts(@RequestBody List<Product> product) {
		return service.saveProducts(product);
	}


	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}

	@GetMapping("/productsById/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}

	@GetMapping("/product/{name}")
	public Product findProdictByName(@PathVariable String name) {
		return service.getProductByName(name);
	}

	@PutMapping("/update")
	public Product updateproduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);

	}

}
