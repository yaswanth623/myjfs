package com.myproduct.model;

public class Product {
	private int productId;
	private String productName;
	private int productPrice;
	private int manufacturedYear;
	private String countryOfOrigin;
	private String productColour;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getManufacturedYear() {
		return manufacturedYear;
	}
	public void setManufacturedYear(int manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getProductColour() {
		return productColour;
	}
	public void setProductColour(String productColour) {
		this.productColour = productColour;
	}
	public Product(int productId, String productName, int productPrice, int manufacturedYear, String countryOfOrigin,
			String productColour) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.manufacturedYear = manufacturedYear;
		this.countryOfOrigin = countryOfOrigin;
		this.productColour = productColour;
	}
	
	public Product() {}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", manufacturedYear=" + manufacturedYear + ", countryOfOrigin=" + countryOfOrigin + ", productColour="
				+ productColour + "]";
	}
	
	
}
