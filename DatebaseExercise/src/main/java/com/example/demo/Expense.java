package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table

public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private double quantity;
	private double price;
	

	public Expense(double quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}


	@ManyToOne()
	@JoinColumn(name = "PERSON_ID")
	private Person person;
	
	
	
	public double getQuantity() {
		return quantity;
	}


	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
