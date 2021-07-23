package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public String name;
	public String surname; 
	public int age; 

	
	@OneToMany(mappedBy = "", cascade = CascadeType.ALL)
	private List<Expense> expenses = new ArrayList<>();
	
	public void addExpense(Expense expense) {
		this.getExpenses().add(expense);
		expense.setPerson(this);
	}
	
	//Defining relationship type: Many to One
	//@ManyToOne 
	//@JoinColumn (name = "ID_User")
	//private Expense expenses;
	
	//--------Constructor-------------
	
	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		//this.expense = expense;
	}	
			
	public Person() {
		super();}
	
		
	//-----Getters and Setters----------

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
	
	@Override
	public String toString() {
		return "Route [id=" + id + ", name=" + name + ", type=" + surname + ", location=" + age + "]";
	    }

	}

