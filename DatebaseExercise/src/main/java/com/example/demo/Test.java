package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



/*
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ch.qos.logback.classic.Logger;
*/
@Component
public class Test implements CommandLineRunner {

	
	//private static final Logger logger = LoggerFactory.getLogger(Test.class);
	
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private ExpenseRepository expenseRepository;
	
	public void run(String... args) throws Exception {
		
		Person jose = new Person("Jose", "Rodriguez", 24);
		Person pablo = new Person("Pablo", "Borno", 21);
		
		personRepository.save(jose);
		personRepository.save(pablo);
		
		Expense water = new Expense (200, 0.5);
		Expense gas = new Expense (30, 0.99);
		
		expenseRepository.save(water);
		expenseRepository.save(gas);
		
		
		  jose.addExpense(water); 
		  //jose.addExpense(gas);
		  
		 pablo.addExpense(water);
		  
		  personRepository.save(jose); 
		  
		 personRepository.save(pablo);
		 
		

	}
}
