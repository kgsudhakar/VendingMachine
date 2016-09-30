package com.sudhakar.interview.vendingmachine.dispenser;

import java.util.Set;

import com.sudhakar.interview.vendingmachine.product.Product;

/**
 * Inventory that takes care of different product types and capable of dispensing a product
 * @author Sudhakar
 *
 */
public interface ProductInventory {
	
	/**
	 * Provides all products available in the Inventory
	 * @return set of products
	 */
	Set<Product> getAllProducts();
	
	/**
	 * checks whether a particular product is available or not.
	 * @param product Product for which availability check has to be done against inventory
	 * @return true if the product is available.
	 */
	boolean isAvailable(Product product);
	
	/**
	 * One item of Product has to be dispensed form the inventory
	 * @param product Product which has to be dispensed
	 * @return true is successfully dispensed.
	 */
	boolean dispenseProduct(Product product);
	
	/**
	 * Adds Product to the inventory with specified quantity
	 * @param product Product that has to be added to inventory
	 * @param quantity Number of items of the Product
	 */
	void loadInventory(Product product, int quantity);

}
