package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		//müþteri ekleme kodlarý var fln
		System.out.println("müþteri eklendi");
		
		logger.log(); // main de customerManager.add(new FileLogger()); new file loggerýn çalýþmasý için 
		//costumer managerýn içine bu fonku eklememiz lazýmdý.
	
	}

}
