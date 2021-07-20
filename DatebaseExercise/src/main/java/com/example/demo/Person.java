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
	
	
	
	
	
	
	//Defining relationship type: Many to One
	//@ManyToOne 
	//@JoinColumn (name = "ID_User")
	//private Expense expenses;
	
	//--------Constructor-------------
	
	public Person(String name, String type, int location, Expense expenses) {
		super();
		this.name = name;
		this.surname = type;
		this.age = location;
		//this.expenses = expenses;
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
	public String getType() {
		return surname;
	}
	public void setType(String type) {
		this.surname = type;
	}
	public int getLocation() {
		return age;
	}
	public void setLocation(int location) {
		this.age = location;
	}
	/*public HashMap<String, Route> getRoutes() {
		return routes;
	}
	public void setRoutes(HashMap<String, Route> routes) {
		this.routes = routes;
	}*/
	
	//------ToString------------
	
	@Override
	public String toString() {
		return "Route [id=" + id + ", name=" + name + ", type=" + surname + ", location=" + age + "]";
	    }
	}

