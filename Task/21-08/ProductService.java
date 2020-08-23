package com.myproduct.service;

import java.util.ArrayList;

import com.myproduct.dao.ProductDao;
import com.myproduct.model.Product;

public class ProductService {

	public static void main(String[] args) {
		
		//To create a new product
		/*Product product=new Product(105, "Speakers", 2000, 2019, "United States", "Black");
		ProductDao dao=new ProductDao();
		System.out.println(dao.createProduct(product));*/
		
		//To retrieve all products
		/*ProductDao dao=new ProductDao();
		ArrayList<Product> productList=dao.getProducts();
		for(Product p:productList) {
			System.out.println(p);
		}*/
		
		//To delete a product
		ProductDao dao=new ProductDao();
		System.out.println(dao.deleteProductById(103));
	}
}
