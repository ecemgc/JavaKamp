import java.rmi.RemoteException;


import abstarct.CustomerService;
import abstarct.MernisAdapterService;
import concrete.BaseCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Customer ecem = new Customer();
		ecem.setFirstName("ECEM");
		ecem.setLastName("GÜNENÇ");
		ecem.setId(5);
		ecem.setDateOfBirth(2002);
		ecem.setNationalityId("123456789");
		
		CustomerService customerCheckManager = new StarbucksCustomerManager(new MernisAdapterService()); 
			customerCheckManager.save(ecem);

	

}
}