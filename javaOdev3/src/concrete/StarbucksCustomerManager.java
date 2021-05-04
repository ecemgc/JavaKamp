package concrete;

import abstarct.CustomerCheckService;
import abstarct.CustomerManager;
import entities.Customer;

public class StarbucksCustomerManager extends  CustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("saved");
		}else {
			System.out.println("not a valid person");
		}
	}

	
	

}
