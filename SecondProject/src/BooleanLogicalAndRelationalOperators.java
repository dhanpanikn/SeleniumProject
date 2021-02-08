
public class BooleanLogicalAndRelationalOperators {

	public static void main(String[] args) {
	/*	boolean isHuman = true;
		
		if (isHuman == true) {
			System.out.println("Yes, i am a Human");
		}
		if (isHuman != true) {
			System.out.println("Yes, i am a Human");
		}
		if (isHuman) {
			System.out.println("Yes, i am a Human");
		}
		
		int myNum = 10
		if (myNum =10) {
			System.out.println("My num is guessed correctly");
			// it will not print the result. because the return value for expression is 10
					// if we use == then the result will be printed.
		}
		
		if (myNum ==10) 
			System.out.println("My num is guessed correctly");
		 	System.out.println("Yes, my guess is correct");
	// it will print only 1st line of the statement.
    // without {} in if statement treated as one line declared there.
	
	*/
		
	int maxQtrScore = 90;
	int maxHlyScore = 92;
	
	if (maxHlyScore > maxQtrScore) {
		System.out.println("Yes...My Half yealy score is higher then Qtr score...");
	}
	
	
	/* if(!(!(isHuman != false){
	 * }
	 */
/* **********LOGICAL OPERATORS*************************
 * */
	
	int historyMark = 79;
	int mathsMark = 79;
	/*if (histMark>= 80) && (mathsMark >=80 && ((HistoryMark + mathsMark) / 2 >= 80)){
		System.out.println("Distinction");
	}
	if (histMark>= 80) || (mathsMark >=80 || ((HistoryMark + mathsMark) / 2 >= 80)){
		System.out.println("Distinction");
	}*/
 
	if ((historyMark > 75) && (!(historyMark >= 80)))
 {
	 System.out.println("You are top scorer but not distinction");
 }
	
}
	
}
