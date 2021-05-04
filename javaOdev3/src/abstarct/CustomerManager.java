package abstarct;

import entities.Customer;

public abstract class CustomerManager implements CustomerService{
	
	

	@Override
	public void save(Customer customer) {
		System.out.println("saved to db : " + customer.getFirstName());
	}
	

}
