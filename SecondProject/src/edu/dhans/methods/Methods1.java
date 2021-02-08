package edu.dhans.methods;

public class Methods1 {

	public static void main(String[] args) {
		String playerName = "Dhans";
		int score = 2000;
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
