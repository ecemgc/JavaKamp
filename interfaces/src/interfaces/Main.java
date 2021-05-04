package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer ecem = new Customer(1,"ecem","g�nen�");
		customerManager.add(ecem);
	}

}
