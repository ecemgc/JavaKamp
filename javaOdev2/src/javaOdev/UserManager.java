package javaOdev;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli kullan�c� eklendi");
	}
	
	public void addMultipleUser(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	
	public void del(User user) {
		System.out.println(user.getId() + " numaral� kullan�c� silindi");
	}
	
	public void confirmedMail(User user) {
		System.out.println(user.getEmail() + " mailiniz onayland�");
	}
	
	

}
