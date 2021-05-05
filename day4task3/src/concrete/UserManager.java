package concrete;

import abstarct.UserService;
import entities.User;

public class UserManager implements UserService{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " ismi ile kayýt edildi.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullanýcýnýn bilgileri güncellendi.");
	}

	@Override
	public void delete(User user) {
System.out.println(user.getFirstName() + " isimli kullanýcý silindi");		
	}


}
