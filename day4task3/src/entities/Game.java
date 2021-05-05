package entities;

public class Game {

	private String gameName;
	private int gamePrice;
	private int gameId;
	
	public Game() {
		
	}
		
	public Game(String gameName, int gamePrice, int gameId) {
		super();
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameId = gameId;
	}



	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	

	
	

}
