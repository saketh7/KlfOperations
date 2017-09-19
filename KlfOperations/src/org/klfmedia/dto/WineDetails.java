package org.klfmedia.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="WineDetails")
public class WineDetails {
	
@Id	
@Column(name="productID")
int productID;

@Column(name="productName")
String productName;

@Column(name="price")
int price;



public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getProductID() {
	return productID;
}
public void setProductID(int productID) {
	this.productID = productID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getDetails()
{
	
	return "Product Id is  "+productID+"Product name is  "+productName+"Price is  "+price;
}




}
