package com.sudhakar.interview.vendingmachine.impl;

import java.util.Set;

import com.sudhakar.interview.vendingmachine.VendingMachine;
import com.sudhakar.interview.vendingmachine.dispenser.ProductInventory;
import com.sudhakar.interview.vendingmachine.payment.PaymentProcessor;
import com.sudhakar.interview.vendingmachine.payment.PaymentType;
import com.sudhakar.interview.vendingmachine.product.Product;

/**
 * Implementation of Vending Machine which has payment processor and product inventory.
 * @author Sudhakar
 *
 */
public class VendingMachineImpl implements VendingMachine {
	
	// All payment related activities are taken care by PaymentProcessor
	private PaymentProcessor paymentProcessor;
	
	// All product related activities are taken care by ProductInventory
	private ProductInventory productInventory;
	
	public VendingMachineImpl(PaymentProcessor paymentProcessor, ProductInventory productInventory){
		this.paymentProcessor = paymentProcessor;
		this.productInventory = productInventory;
	}

	/**
	 * Returns all payment type supported by the vending machine
	 */
	public Set<PaymentType> getAllPaymentTypes() {
		return paymentProcessor.getAllPaymentTypes();
	}

	/**
	 * Gets all Product loaded from product inventory
	 */
	public Set<Product> getAllProducts() {
		return productInventory.getAllProducts();
	}

	/**
	 * Receives payment from User for the specified product with given payment type
	 */
	public void receivePayment(Product product, PaymentType paymentType,
			double payableAmount) {
		paymentProcessor.receivePayment(paymentType, payableAmount);
	}

	/**
	 * Once the payment is successful, vending machine dispenses the product
	 */
	public boolean dispenseProduct(Product product, PaymentType paymentType, double amount) {
		boolean dispenseStatus = productInventory.dispenseProduct(product);
		if(!dispenseStatus){
			paymentProcessor.revertPayment(paymentType, amount);
		}
		return dispenseStatus;
	}

	public PaymentProcessor getPaymentProcessor() {
		return paymentProcessor;
	}

	public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

	public ProductInventory getProductInventory() {
		return productInventory;
	}

	public void setProductInventory(ProductInventory productInventory) {
		this.productInventory = productInventory;
	}

}
