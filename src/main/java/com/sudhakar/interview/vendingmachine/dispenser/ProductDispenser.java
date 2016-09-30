package com.sudhakar.interview.vendingmachine.dispenser;

import com.sudhakar.interview.vendingmachine.product.Product;

/**
 * Root interface any dispenser to dispense a proudct from product inventory 
 * @author Sudhakar
 *
 */
public interface ProductDispenser {
	
	/**
	 * Dispenses one items of the product from the Vending machine
	 * @param product Product that has to be dispensed
	 * @return true if the product is dispensed successfully. 
	 */
	boolean dispense(Product product);

}
