import java.util.LinkedList;

public class NumberTester {
	/**checks if the number is a Armstrong Number**/
	public static boolean isArmstrongNumber(int numberToCheck) {
			
			int startingNumber = numberToCheck;
			
			//Will store individual digits in a LinkedList 
			LinkedList<Integer> digits = new LinkedList<Integer>();
			
			//spliting up the number into individual digits using %10
			while (numberToCheck > 0){
				//pushing last digit of the number onto the list
				digits.push(numberToCheck % 10);
				
				//removing the last digit from the number
				numberToCheck = numberToCheck / 10;
			}
			
			int numberOfDigits = digits.size();
			
			int total = 0;
			//will be looping trough the list
			while(!digits.isEmpty()){
				total+= Math.pow(digits.pop(), numberOfDigits);
			}
			
			return total == startingNumber;
			
		}

}
