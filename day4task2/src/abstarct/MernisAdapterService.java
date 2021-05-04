package abstarct;

import java.rmi.RemoteException;

import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisAdapterService implements CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy xx = new KPSPublicSoapProxy();
		
		var result = xx.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()),
				customer.getFirstName(),
				customer.getLastName(),
				customer.getDateOfBirth());
		
		if (result) {
			System.out.println("Kimlik Doðrulandý");
			return true;
		} else {
			return false;
		}
	
	
	
	}



}




