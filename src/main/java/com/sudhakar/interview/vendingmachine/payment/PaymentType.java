package com.sudhakar.interview.vendingmachine.payment;

/**
 * Top level Interface for all payment type
 * @author Sudhakar
 *
 */
public interface PaymentType {
	
	/**
	 * Gets the Id which should be used selecting from different payment types
	 * @return number shown to the user to select
	 */
	int getIdForSelection();
	
	/**
	 * Make payment again the payment type
	 * @param payableAmount Amount that has to be deducted from the payment method
	 * @return true if the payment is successful. 
	 */
	boolean makePayment(double payableAmount);
	
	/**
	 * Revert the payment from the payment types if the dispense is not successful.
	 * @param amount Amount that has to be credited back to the payment type.
	 * @return true if the payment revert is successful.
	 */
	boolean revertPayment(double amount);

}
