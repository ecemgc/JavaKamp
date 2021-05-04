package javaOdev3;

import java.util.Date;

import abstarct.CustomerManager;
import concrete.NeroCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Ecem","Günenç", new Date(),"52159511166");
		
		
		CustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer1);
		
	}

}
