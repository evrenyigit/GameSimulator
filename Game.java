
public class Game {

	private String gameId;
	private String gameName;
	private double gamePrice;
	
	public Game(String gameId, String gameName, double gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
}
