package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		//m��teri ekleme kodlar� var fln
		System.out.println("m��teri eklendi");
		
		logger.log(); // main de customerManager.add(new FileLogger()); new file logger�n �al��mas� i�in 
		//costumer manager�n i�ine bu fonku eklememiz laz�md�.
	
	}

}
