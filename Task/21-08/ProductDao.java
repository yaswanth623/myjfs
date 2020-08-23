package com.myproduct.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.myproduct.dbutil.DBConnection;
import com.myproduct.model.Product;

public class ProductDao {
	
	public String createProduct(Product product) {
		try {
		Connection connection=DBConnection.getConnect();
		String sql="insert into myproducts values(?,?,?,?,?,?)";
		PreparedStatement stat=connection.prepareStatement(sql);
		
		stat.setInt(1, product.getProductId());
		stat.setString(2, product.getProductName());
		stat.setInt(3, product.getProductPrice());
		stat.setInt(4, product.getManufacturedYear());
		stat.setString(5, product.getCountryOfOrigin());
		stat.setString(6, product.getProductColour());
		
		int res=stat.executeUpdate();
		if(res>0)
			return "Product created";
		else
			return "Product cannot be created";
		}
		catch(Exception e) {
		e.printStackTrace();
		return "Exception "+e;
		}
	}
	
	public ArrayList<Product> getProducts() {
		try {
		Connection connection=DBConnection.getConnect();
		String sql="select * from myproducts";
		PreparedStatement stat=connection.prepareStatement(sql);
		
		ArrayList<Product> productList=new ArrayList<>();
		
		ResultSet rs=stat.executeQuery();
		if(rs.next()) {
			do {
				int productId= rs.getInt(1);
				String productName=rs.getString(2);
				int productPrice= rs.getInt(3);
				int manufacturedYear= rs.getInt(4);
				String countryOfOrigin=rs.getString(5);
				String productColour=rs.getString(6);
				
				Product product=new Product(productId, productName, productPrice, manufacturedYear, countryOfOrigin, productColour);
				
				productList.add(product);
			}
			while(rs.next());
		}
		return productList;
		}
		catch(Exception e) {
		e.printStackTrace();
		}
		return null;
	}
	
	public int deleteProductById(int productId) {
		try {
			Connection connection=DBConnection.getConnect();
			String sql="delete from myproducts where productid=?";
			PreparedStatement stat=connection.prepareStatement(sql);
			
			stat.setInt(1, productId);
			int res=stat.executeUpdate();
			if(res>0) {
				return res;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
