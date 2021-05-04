package concrete;

import java.rmi.RemoteException;

import abstarct.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		try {
			if(customerCheckService.checkIfRealPerson(customer)) {
				super.save(customer);
			}else {
				System.out.println("cannot saved " + customer.getFirstName());
			}
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


		


}
