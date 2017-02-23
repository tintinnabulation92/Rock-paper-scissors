import java.util.Scanner;

public class GameLogic {

	Player player1 = new Player();
	Player player2 = new Player();
	
	Shapes shape1 = new Shapes();
	Shapes shape2 = new Shapes();
	
	Scoreboard scoreboard = new Scoreboard();
	
	
	public void GamePlay(){
		//Shapes paper = new Shapes();
		//Shapes rock = new Shapes();
		//Shapes scissors = new Shapes();
		//Game game1 = new Game();
		setupGame();
		while(true){
		selectShape();
		startBattle();
		int x = scoreboard.getP1Score();
		int y = scoreboard.getP2Score();
		System.out.println("Player 1 score = " + x);
		System.out.println("Player 1 score = " + y);
			if (scoreboard.getP1Score() == 3 || scoreboard.getP2Score() ==3){
				System.out.println("Game ends! ");
				break;
			}
		//game1.endGame();
		}
		
	}
	
	public void setupGame(){
		
		Scanner readNames = new Scanner(System.in);
		System.out.println("Enter the name of player 1");
		String tempName = readNames.nextLine();
		player1.setPlayerName(tempName);
		tempName = null;
		System.out.println("Enter the name of player 2");
		tempName = readNames.nextLine();
		player2.setPlayerName(tempName);
		tempName = null;
		
		System.out.println("Player 1 name: " + player1.getPlayerName() + " Player2 name: " + player2.getPlayerName());
	}
	
	public void selectShape(){
		System.out.println(player1.getPlayerName() + "Select your shape! 1:Scissors 2: Paper 3: Rock..");
		Scanner readShapes = new Scanner(System.in);
		int tempShape = readShapes.nextInt();
			if(tempShape == 1){
				shape1.setPlayerOneShapeName("Scissors");
				
			}
			else if(tempShape == 2){
				shape1.setPlayerOneShapeName("Paper");
			}
			
			else if (tempShape == 3){
				shape1.setPlayerOneShapeName("Rock");
			}
			
			else {
				//game should stop
				System.out.println("Wrong number. Terminating...");
			}
		
		
		System.out.println(player2.getPlayerName() + "Select your shape! 1:Scissors 2: Paper 3: Rock..");
		tempShape = readShapes.nextInt();
			if(tempShape == 1){
				shape2.setPlayerTwoShapeName("Scissors");
				
			}
			else if(tempShape == 2){
				shape2.setPlayerTwoShapeName("Paper");
			}
			
			else if (tempShape == 3){
				shape2.setPlayerTwoShapeName("Rock");
			}
			
			else {
				//game should stop
				System.out.println("Wrong number. Terminating...");
			}
		//shape2.setPlayerTwoShapeName(tempShape);
		
		
		System.out.println(player1.getPlayerName() + " has chosen " + shape1.getPlayerOneShapeName());
		System.out.println(player2.getPlayerName() + " has chosen " + shape2.getPlayerTwoShapeName());
	}
	
	public void startBattle(){
		
		if (shape1.getPlayerOneShapeName().equals("Rock")){
			if(shape2.getPlayerTwoShapeName().equals("Scissors")){
				System.out.println("p1 wins - score board");
				//p1 wins - score board
				scoreboard.setP1Score(1);
			}
			
			else if(shape2.getPlayerTwoShapeName().equals("Paper")){
				//p2 wins - score board
				System.out.println("p2 wins - score board");
				scoreboard.setP2Score(1);
			}
			
			else{
				System.out.println("draw");
				//draw
			}
		}
		
		else if (shape1.getPlayerOneShapeName().equals("Scissors")){
			if(shape2.getPlayerTwoShapeName().equals("Scissors")){
				//draw
				System.out.println("draw");
			}
			else if (shape2.getPlayerTwoShapeName().equals("Paper")){
				//p1 wins
				System.out.println("p1 wins - score board");
				scoreboard.setP1Score(1);
			}
			
			else {
				//p2 wins
				System.out.println("p2 wins - score board");
				scoreboard.setP2Score(1);
			}
		}
		
		else if (shape1.getPlayerOneShapeName().equals("Paper")){
			if(shape2.getPlayerTwoShapeName().equals("Scissors")){
				//p2 wins
				System.out.println("p2 wins - score board");
				scoreboard.setP2Score(1);
			}
			
			else if (shape2.getPlayerTwoShapeName().equals("Paper")){
				//draw
				System.out.println("draw");
			}
			
			else{
				//p1 wins
				System.out.println("p1 wins - score board");
				scoreboard.setP1Score(1);
			}
		}
		
		else {
			System.out.println("CRITICAL ERROR");
			// APP SHOULD TERMINATE
		}
	}
	
}
