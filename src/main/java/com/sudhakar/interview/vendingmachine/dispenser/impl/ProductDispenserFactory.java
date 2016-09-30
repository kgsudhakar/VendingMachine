package com.sudhakar.interview.vendingmachine.dispenser.impl;

import com.sudhakar.interview.vendingmachine.dispenser.ProductDispenser;

/**
 * Factory that can produce different Product Dispenser depending on the input 
 * @author Sudhakar
 *
 */
public class ProductDispenserFactory {
	
	public static ProductDispenser createPrdocutDispenser(String dispenserType) {
		ProductDispenser dispenser = null;
		if(dispenserType.equals("console")) {
			dispenser = new ConsoleDispenser();
		}
		return dispenser;
	}

}
