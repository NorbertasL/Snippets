
public class StringTester {
	
	
	/**
	 * Checks if a string is all caps
	 * Will ignore all non English alphabet letters, numbers and symbols
	 * If the string doesn't contain any valid letter it will return false
	 * @param s is the string to check
	 * @return a boolean.False if s doesn't contain any valid letters
	 */
	public static boolean isAllCaps(String s){
        int numberOfLetter = 0;
		for(Character c : s.toCharArray()){
            if(!Character.isLetter(c))
                continue;
            else if (!Character.isUpperCase(c))
                return false;   
            numberOfLetter++;
		}	
        //if numberOfLetter is 0 then the String contained no letters and by default is false
		return numberOfLetter == 0 ? false : true;
       
	}

}
