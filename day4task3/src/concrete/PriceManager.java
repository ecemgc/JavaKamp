package concrete;

import abstarct.PriceService;
import entities.Campaign;
import entities.Game;

public class PriceManager implements PriceService {

	@Override
	public double priceAfterDiscount(Game game, Campaign camp) {
		var result = game.getGamePrice() - (game.getGamePrice() * camp.getDiscount() / 100);
		return result;
	}

}
