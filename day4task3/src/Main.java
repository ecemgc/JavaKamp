import abstarct.CampaignService;
import abstarct.Confirm;
import abstarct.GameService;
import abstarct.PriceService;
import abstarct.UserService;
import concrete.CampaignManager;
import concrete.ConfirmManager;
import concrete.GameManager;
import concrete.PriceManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		User ecem = new User("ecem","günenç","17541112313",1,15);
		Game bigMachine = new Game("big machine",12,2);
		Campaign coronaCamp = new Campaign("corona campaign",2022,45);
		
		
		UserService userManager = new UserManager();
		userManager.add(ecem);
		userManager.delete(ecem);
		userManager.update(ecem);
		System.out.println("  ");
		
		GameService gameManager = new GameManager();
		gameManager.addGame(bigMachine);
		gameManager.deleteGame(bigMachine);
		gameManager.updateGame(bigMachine);
		System.out.println("  ");
		
		Confirm confirmManager = new ConfirmManager();
		confirmManager.confirm(ecem);
		System.out.println("  ");
		
		PriceService priceManager = new PriceManager();
		priceManager.priceAfterDiscount(bigMachine, coronaCamp);
		System.out.println("  ");
		
		CampaignService campaignManager = new CampaignManager();
		campaignManager.addCamp(coronaCamp, bigMachine);
		campaignManager.deleteCamp(coronaCamp, bigMachine);
		campaignManager.updateCamp(coronaCamp, bigMachine);
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
