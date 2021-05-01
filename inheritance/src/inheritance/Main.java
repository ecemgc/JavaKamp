package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCostumer ecem = new IndividualCostumer();
		ecem.costumerNumber = "12345";
		
		
		CorporateCostumer hepsiBurada = new CorporateCostumer();
		hepsiBurada.costumerNumber = "78978";
		
		SendikaCostumer abc = new SendikaCostumer();
		abc.costumerNumber = "4561";
		
		
		
		CostumerManager costumerManager = new CostumerManager();
		costumerManager.add(hepsiBurada);
		costumerManager.add(ecem);
		costumerManager.add(abc);
		
		
	
		
				
	}

}
