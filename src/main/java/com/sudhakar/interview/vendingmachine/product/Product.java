package com.sudhakar.interview.vendingmachine.product;

/**
 * Top level interface for all the products any vending machine can have. 
 * 
 * @author Sudhakar
 *
 */
public interface Product {
	
	/**
	 * 
	 * @return id of the product which will be used by the user to select the product
	 */
	int getUserSelectionId();
	
	/**
	 * Each product should contain the price
	 * @return price of the product
	 */
	double getPrice();
	
	/**
	 * Returns the name of the product
	 * @return name of the product
	 */
	String getName();
	
}
