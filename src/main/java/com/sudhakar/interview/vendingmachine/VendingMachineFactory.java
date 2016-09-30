package com.sudhakar.interview.vendingmachine;

import com.sudhakar.interview.vendingmachine.dispenser.ProductDispenser;
import com.sudhakar.interview.vendingmachine.dispenser.ProductInventory;
import com.sudhakar.interview.vendingmachine.dispenser.impl.ProductDispenserFactory;
import com.sudhakar.interview.vendingmachine.dispenser.impl.ProductInventoryImpl;
import com.sudhakar.interview.vendingmachine.impl.VendingMachineImpl;
import com.sudhakar.interview.vendingmachine.payment.PaymentProcessor;
import com.sudhakar.interview.vendingmachine.payment.PaymentType;
import com.sudhakar.interview.vendingmachine.payment.impl.PaymentProcessorImpl;
import com.sudhakar.interview.vendingmachine.payment.impl.PaymentTypeFactory;
import com.sudhakar.interview.vendingmachine.product.Product;
import com.sudhakar.interview.vendingmachine.product.impl.ProductFactory;

/**
 * Factory for creating different implementation of Vending machine
 * @author Sudhakar
 *
 */
public class VendingMachineFactory {
	
	public static VendingMachine createVendingMachine(String vendingMachineType) {		
		VendingMachine vendingMachine = null;
		if(vendingMachineType.equals("console")) {		
			ProductDispenser dispenser = ProductDispenserFactory.createPrdocutDispenser("console");
			
			PaymentType consolePayment = PaymentTypeFactory.createPaymentType("console");
			PaymentProcessor processor = new PaymentProcessorImpl();
			processor.addPaymentType(consolePayment);	
			
			Product water = ProductFactory.createProduct("water");
			Product snack = ProductFactory.createProduct("snack");
			
			ProductInventory inventory = new ProductInventoryImpl(dispenser);		
			inventory.loadInventory(water, 5);
			inventory.loadInventory(snack, 6);
			
			vendingMachine = new VendingMachineImpl(processor,inventory);
		}		
		return vendingMachine;
	}

}
