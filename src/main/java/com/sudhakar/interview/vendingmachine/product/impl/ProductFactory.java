package com.sudhakar.interview.vendingmachine.product.impl;

import com.sudhakar.interview.vendingmachine.product.Product;

/**
 * Factory for creating different Products that should be placed in Vending machine
 * @author Sudhakar
 *
 */
public class ProductFactory {
	
	public static Product createProduct(String productName) {
		Product product = null;
		if(productName.equals("water")) {
			product = new Water(100,"water",3.0);
		}else if(productName.equals("snack")) {
			product = new Snack(101,"snack",2.0);
		}
		return product;
	}

}
