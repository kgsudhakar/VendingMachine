package com.sudhakar.interview.vendingmachine;

import java.util.Set;

import com.sudhakar.interview.vendingmachine.payment.PaymentType;
import com.sudhakar.interview.vendingmachine.product.Product;

/**
 * Vending Machine capable of dispensing a product provided with payment provided
 * @author Sudhakar
 *
 */
public interface VendingMachine {
	
	/**
	 * Get All payment types supported by the vending machine.
	 * @return set of all payment types supported
	 */
	Set<PaymentType> getAllPaymentTypes();
	
	/** 
	 * Get set of all products available in the vending machine
	 * @return set of all products or null if no products available
	 */
	Set<Product> getAllProducts();
	
	/**
	 * Receive payment for a product with given payment type 
	 * @param product - Product for which payment has to be made
	 * @param paymentType - mode of payment 
	 * @param amountPaid - amount paid by the user
	 */
	void receivePayment(Product product, PaymentType paymentType, double amountPaid);
	
	/**
	 * Dispense a product once payment is successful. 
	 * @param product - Product for which user paid
	 * @return true if the product is dispensed successfully
	 */
	boolean dispenseProduct(Product product, PaymentType paymentType, double amountPaid);
	
}
