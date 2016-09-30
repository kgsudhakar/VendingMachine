package com.sudhakar.interview.vendingmachine.payment.impl;

import java.util.HashSet;
import java.util.Set;

import com.sudhakar.interview.vendingmachine.payment.PaymentProcessor;
import com.sudhakar.interview.vendingmachine.payment.PaymentType;

/**
 * Implementation of payment processor which is the entry point for all payment activities
 * @author Sudhakar
 *
 */
public class PaymentProcessorImpl implements PaymentProcessor {
	
	private Set<PaymentType> paymentTypes = new HashSet<PaymentType>();

	public Set<PaymentType> getAllPaymentTypes() {
		return paymentTypes;
	}

	public boolean receivePayment(PaymentType paymentType, double payableAmount) {
		return paymentType.makePayment(payableAmount);
	}

	public Set<PaymentType> getPaymentTypes() {
		return paymentTypes;
	}

	public void setPaymentTypes(Set<PaymentType> paymentTypes) {
		this.paymentTypes = paymentTypes;
	}

	public void addPaymentType(PaymentType paymentType) {
		paymentTypes.add(paymentType);
	}

	public boolean revertPayment(PaymentType paymentType, double amount) {
		paymentType.revertPayment(amount);
		return false;
	}

}
