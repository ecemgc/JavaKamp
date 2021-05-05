package concrete;

import abstarct.CampaignService;
import entities.Campaign;
import entities.Game;


public class CampaignManager implements CampaignService{

	@Override
	public void addCamp(Campaign camp, Game game) {
		System.out.println(game.getGameName() + " isimli oyuna " + camp.getCampName() + " kampanyas� eklendi");
	}

	@Override
	public void updateCamp(Campaign camp, Game game) {
		System.out.println(game.getGameName() + " isimli oyundaki " + camp.getCampName() + " kampanyas� g�ncellendi");		
	}

	@Override
	public void deleteCamp(Campaign camp, Game game) {
		System.out.println(game.getGameName() + " isimli oyundan " + camp.getCampName() + " kampanyas� silindi");		
	}
	



	
	

}
