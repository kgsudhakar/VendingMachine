package com.sudhakar.interview.vendingmachine.dispenser.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.sudhakar.interview.vendingmachine.dispenser.ProductDispenser;
import com.sudhakar.interview.vendingmachine.dispenser.ProductInventory;
import com.sudhakar.interview.vendingmachine.product.Product;

/**
 * Implementation of ProductInventory which manages the inventory for the vending machine. provides facility to check availability, 
 * dispense a product and loading inventory with quantity of products
 * @author Sudhakar
 *
 */
public class ProductInventoryImpl implements ProductInventory {
	
	// Map serves as Inventory engine which holds product as key and number of items as values.  
	private Map<Product, Integer> inventory = new HashMap<Product, Integer>();
	
	private ProductDispenser dispenser;
	
	public ProductInventoryImpl(ProductDispenser dispenser) {
		this.dispenser = dispenser;
	}

	/**
	 * Returns Set of Products supported by the Inventory
	 */
	public Set<Product> getAllProducts() {
		return inventory.keySet();
	}

	/**
	 * checks whether given product is available in inventory
	 */
	public boolean isAvailable(Product product) {
		Integer availableQuantity = getAvailableQuantity(product);
		return availableQuantity > 0 ? true: false;
	}

	/**
	 * Dispenses one items of specified product to the specified dispenser
	 */
	public boolean dispenseProduct(Product product) {
		int availablequantity = getAvailableQuantity(product);
		if(availablequantity > 0) {
			dispenser.dispense(product);
			inventory.put(product, availablequantity-1);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Load the inventory with given product and quantity
	 */
	public void loadInventory(Product product, int quantity) {
		int availablequantity = getAvailableQuantity(product);
		if(availablequantity == 0) {
			inventory.put(product, quantity);
		}else{
			inventory.put(product, quantity+availablequantity);
		}
	}
	
	private int getAvailableQuantity(Product product) {
		Integer availbleQuantity = inventory.get(product);
		if(availbleQuantity == null){
			return 0;
		}		
		return availbleQuantity;
	}

	public Map<Product, Integer> getInventory() {
		return inventory;
	}

	public void setInventory(Map<Product, Integer> inventory) {
		this.inventory = inventory;
	}

	public ProductDispenser getDispenser() {
		return dispenser;
	}

	public void setDispenser(ProductDispenser dispenser) {
		this.dispenser = dispenser;
	}
}
