package abstarct;

import entities.Campaign;
import entities.Game;

public interface PriceService {

	double priceAfterDiscount(Game game, Campaign camp);
	
}
