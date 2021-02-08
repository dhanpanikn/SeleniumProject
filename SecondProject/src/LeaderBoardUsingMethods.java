
public class LeaderBoardUsingMethods {

	public static void main(String[] args) {
		String playerName ="DHans";
		int score = 2000;
		findPosition(playerName, score);
		
		playerName = "Sarrvesh";
		score = 4000;
		findPosition(playerName, score);
		
		findPosition();
	}	
	public static void findPosition(String playerName, int score) {
		if (score > 1000) {
			System.out.println( playerName + " is holding position 1");
	} else if (score < 1000 && score > 500) {
		    System.out.println( playerName + " is holding position 2");
    } else if (score < 500 && score > 100) {
    		System.out.println( playerName + " is holding position 3");
    } else {
    		System.out.println( playerName + " is holding position 4");
    }
	
	}

	public static void findPosition() {
		String playerName = "Satthvika";
		int score = 2500;
		if (score > 1000) {
			System.out.println( playerName + " is holding position 1");
	} else if (score < 1000 && score > 500) {
		    System.out.println( playerName + " is holding position 2");
    } else if (score < 500 && score > 100) {
    		System.out.println( playerName + " is holding position 3");
    } else {
    		System.out.println( playerName + " is holding position 4");
    }
	
	}

}