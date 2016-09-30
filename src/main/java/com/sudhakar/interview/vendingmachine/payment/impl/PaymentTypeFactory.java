package com.sudhakar.interview.vendingmachine.payment.impl;

import com.sudhakar.interview.vendingmachine.payment.PaymentType;

/**
 * Factory for creating different payment types
 * @author Sudhakar
 *
 */
public class PaymentTypeFactory {
	
	public static PaymentType createPaymentType(String methodOfPayment) {
		PaymentType paymentType = null;
		if(methodOfPayment.equals("console")) {
			paymentType = new ConsolePayment(1001);
		}
		return paymentType;
	}

}
