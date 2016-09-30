package com.sudhakar.interview.vendingmachine.payment.impl;

import com.sudhakar.interview.vendingmachine.payment.PaymentType;
/**
 * Implementation of payment type with the confirmation on the console.
 * @author Sudhakar
 *
 */
public class ConsolePayment implements PaymentType {
	
	private final int idForSelection;
	
	public ConsolePayment(int idForSelection) {
		this.idForSelection = idForSelection;
	}

	public boolean makePayment(double paymentAmount) {
		System.out.printf("Payment Successful for amount : %f %n", paymentAmount);
		return true;
	}

	public boolean revertPayment(double amount) {
		System.out.printf("Payment has been reverted for amount : %f %n", amount);
		return false;
	}

	public int getId() {
		return idForSelection;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ConsolePayment) {
			if (this.getId() == ((ConsolePayment) obj).getId()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return idForSelection;
	}
	
	@Override
	public String toString(){
		return idForSelection+":CONSOLE";
	}

	@Override
	public int getIdForSelection() {
		return idForSelection;
	}

}
