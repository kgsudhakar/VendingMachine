package com.sudhakar.interview.vendingmachine.dispenser.impl;

import com.sudhakar.interview.vendingmachine.dispenser.ProductDispenser;
import com.sudhakar.interview.vendingmachine.product.Product;

/**
 * Dispenser which will dispense a product to the system console to the user. 
 * @author Sudhakar
 *
 */
public class ConsoleDispenser implements ProductDispenser {
	
	/**
	 * Dispense the specified product to the user
	 * @param product to dispense
	 * @return true if product is dispensed successfully
	 */
	public boolean dispense(Product product) {
		System.out.printf("Your Product %s has been dispensed %n", product.getName().toUpperCase());
		return true;
	}

}
