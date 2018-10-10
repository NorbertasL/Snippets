
public class StringManipulator {
	/**Takes in a string on multiple words
	 * and returns and Acronym **/
	public static String makeAcronym(String s){
		//splits the string into individual word and put the in the array
		String [] words = s.split("[ -]");
		
		String acronym = "";
		for(String st : words){
			acronym+=st.charAt(0);
		}
		return acronym.toUpperCase();
	}
	
	
	
	

}
