
public class Game {

	
	
	public void startGame(){
		System.out.println("Let's play a game of...");
        System.out.println();
        System.out.println("ROCK                    PAPER                           SCISSORS!!");
        System.out.println("    _______                 _______                    _______");
        System.out.println("---'   ____)            ---'   ____)____           ---'   ____)____");
        System.out.println("      (_____)                     ______)                    ______)");
        System.out.println("      (_____)                     _______)                __________)");
        System.out.println("      (____)                    _______)                 (____)");
        System.out.println("---.__(___)             ---.__________)            ---.__(___)");
        System.out.println();
        System.out.println("We play as long as any player gets 3 points!");


	}
	
	/*public void endGame(){
		//shows all the statistics - summary 
		//Scoreboard scoreboard1 = new Scoreboard(); //bug - another object reffered to these variables which is answered V
		//int x = scoreboard1.getP1Score();			// http://stackoverflow.com/questions/25404348/how-to-use-getters-and-setters-in-two-different-classes
		//System.out.println("Player 1 score = " + x);
		//int y = scoreboard1.getP2Score();
		//System.out.println("Player 1 score = " + y);
		
		
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game1 = new Game();
		game1.startGame();
		GameLogic logic1 = new GameLogic();
		logic1.GamePlay();
	}

}
