package inheritance;

public class CostumerManager {

	public void add(Costumer costumer) {
		System.out.println(costumer.costumerNumber + "kaydedildi.");
	}
	
	
	public void addMultiple(Costumer[] costumers) {
		for(Costumer costumer : costumers) {
			add(costumer);
		}
	}



	
}
