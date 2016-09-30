package com.sudhakar.interview.vendingmachine.payment;

import java.util.Set;

/**
 * Top level interface For handling all payment processing
 * @author Sudhakar
 *
 */
public interface PaymentProcessor {
	
	/**
	 * Adds a payment types to the processor
	 * @param paymentType Type of payment
	 */
	void addPaymentType(PaymentType paymentType);
	
	
	/**
	 * Get all paymentTypes supported by PaymentProcessor which will be part of Vending machine
	 * @return set of all payment types supported
	 */
	Set<PaymentType> getAllPaymentTypes();
	
	
	/**
	 * Receives the amount from the specified payment type 
	 * @param paymentType Type of payment 
	 * @param payableAmount amount to be deducted from payment type
	 */
	boolean receivePayment(PaymentType paymentType, double payableAmount);
	
	/**
	 * Revert the payment in case if the product is not dispensed for some reason
	 * @param paymentType Type of payment
	 * @param amount Anount to be reverted
	 * @return true if revertPayment is successful
	 */
	boolean revertPayment(PaymentType paymentType, double amount);

}
