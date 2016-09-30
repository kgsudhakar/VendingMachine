package com.sudhakar.interview.vendingmachine.product;

/**
 * This class provides a skeletal implementation for all Product
 * @author Sudhakar
 *
 */
public abstract class AbstractProduct implements Product {
	
	private int idForUserSelection;
	
	private final String name;
	
	private double price;
	
	public AbstractProduct(int id, String name, double price) {
		this.idForUserSelection = id;
		this.name = name;
		this.price = price;
	}

	public int getUserSelectionId() {
		return idForUserSelection;
	}

	public void setId(int id) {
		this.idForUserSelection = id;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			if(((Product) obj).getUserSelectionId() == idForUserSelection) {				
				return true;
			}
		}
		return false;		
	}
	
	@Override
	public int hashCode() {
		return idForUserSelection;
	}
	
	@Override
	public String toString(){
		return idForUserSelection+":"+name.toUpperCase();
	}

}
