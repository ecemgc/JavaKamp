package abstarct;

import entities.Campaign;
import entities.Game;

public interface CampaignService {
	void addCamp(Campaign camp, Game game);
	void updateCamp(Campaign camp, Game game);
	void deleteCamp(Campaign camp, Game game);

	
	

}
