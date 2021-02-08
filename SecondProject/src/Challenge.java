
public class Challenge {

	public static void main(String[] args) {
		double myFirstNum = 20.0;
		double mySecNum = 11.0;
		double result = myFirstNum * mySecNum;
		
	    System.out.println("Step 1 Result : " +result);
	    
	    double result1 = result % myFirstNum;
	    System.out.println("Step 2 Result: " +result1);
	    
	    double myThirdNum = 40.0;
	    double result3 = result % myThirdNum;
	    
	    System.out.println("Step 3 Result : " + result3);
	    
	    double result4 = result3 + 30.0;
	    System.out.println("Step 4 Result : "+ result4);
	    
	    double result5 = (result3 + result4) * 10.0;
	    //double result6 = result5 * 10.0;
	    
	    System.out.println("Step 5 result : " + result5);
	    
	}

}
