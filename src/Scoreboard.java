
public class Scoreboard {

	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	
	
	public void setP1Score(){
		playerOneScore++;
	}
	
	public void setP2Score(){
		playerTwoScore++;
	}
	
	public int getP1Score(){
		return playerOneScore;
	}
	
	public int getP2Score(){
		return playerTwoScore;
	}
	
	public void clearScores(){
		this.playerOneScore = 0;
		this.playerTwoScore = 0;
	}
}
