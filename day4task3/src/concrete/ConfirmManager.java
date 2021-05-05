package concrete;

import abstarct.Confirm;
import entities.User;

public class ConfirmManager implements Confirm{

	@Override
	public boolean confirm(User user) {
		if(user.getNationalityId().length()!=11) {
			System.out.println("kimlik doğrulanamadı.");
			return false;
		}else {
			System.out.println("kimlik doğrulandı.");
			return false;
		}
	}


	
	

}
