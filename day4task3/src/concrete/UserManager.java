package concrete;

import abstarct.UserService;
import entities.User;

public class UserManager implements UserService{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " ismi ile kay�t edildi.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c�n�n bilgileri g�ncellendi.");
	}

	@Override
	public void delete(User user) {
System.out.println(user.getFirstName() + " isimli kullan�c� silindi");		
	}


}
