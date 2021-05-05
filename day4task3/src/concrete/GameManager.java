package concrete;

import abstarct.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " isimli oyun eklendi");
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName() + " isimli oyun güncellendi");
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " isimli oyun silindi");
	}
	
	

}
