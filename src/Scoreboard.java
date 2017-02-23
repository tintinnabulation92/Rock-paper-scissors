
public class Scoreboard {

	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	
	
	public void setP1Score(int point){
		this.playerOneScore = playerOneScore + point;
	}
	
	public void setP2Score(int point){
		this.playerTwoScore = playerTwoScore + point;
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
