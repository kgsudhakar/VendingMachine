package com.sudhakar.interview.vendingmachine.main;

import java.util.Scanner;
import java.util.Set;

import com.sudhakar.interview.vendingmachine.VendingMachine;
import com.sudhakar.interview.vendingmachine.VendingMachineFactory;
import com.sudhakar.interview.vendingmachine.payment.PaymentType;
import com.sudhakar.interview.vendingmachine.product.Product;

/**
 * Sample operation of Console Vending Machine Implementation
 * @author Sudhakar
 *
 */
public class Main {
	
	public static void main(String[] args) {
		VendingMachine consoleVendingMachine = VendingMachineFactory.createVendingMachine("console");
		Scanner scanner= new Scanner(System.in);
		
		// Make the user to select the product
		Set<Product> allProducts = consoleVendingMachine.getAllProducts();		
		System.out.printf("List of Products Available (Format -> (Selection Id: Product Name)): %s %n", allProducts);
		System.out.printf("Enter the product code you want to purchase : ");
		int selectedProductId = scanner.nextInt();
		Product selectedProduct = null;
		for(Product product:allProducts) {
			if(product.getUserSelectionId() == selectedProductId) {
				selectedProduct = product;
			}
		}
		System.out.printf("You have selected the product : %s %n %n", selectedProduct);
		
		// Make the user to select the payment type
		Set<PaymentType> allPaymentTypes = consoleVendingMachine.getAllPaymentTypes();
		System.out.printf("List of Payment Types Available (Format -> (Selection Id: Payment Name)): %s %n", allPaymentTypes);
		System.out.printf("Enter the Payment type : ");
		int selectedPaymentId = scanner.nextInt();
		PaymentType selectedPaymentType = null;
		for(PaymentType paymentType : allPaymentTypes) {
			if(paymentType.getIdForSelection() == selectedPaymentId) {
				selectedPaymentType = paymentType;
			}
		}
		System.out.printf("You have selected the payment : %s %n %n",selectedPaymentType);

		// Allow the user to enter the amount provides
		System.out.printf("Enter the amount : ");
		int amountPaid = scanner.nextInt();
		
		System.out.println();
		consoleVendingMachine.receivePayment(selectedProduct, selectedPaymentType, amountPaid);
		
		consoleVendingMachine.dispenseProduct(selectedProduct, selectedPaymentType, amountPaid);
		
		scanner.close();
	}
}
