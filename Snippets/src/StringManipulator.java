
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
	
	/**Method that can generate multiple spaces
	 * 
	 * @param n number of repeats
	 * @return String of spaces " "
	 */
	public String spacePadding(int n) {
		return (n == 0 ? "" : String.format("%" + n + "s", " "));
	}
	/**Method that can generate multiple chars
	 * 
	 * @param n number of repeats
	 * @param c the char to repeat
	 * @return String of chars
	 * 
	 */
	public String charPadding(int n, char c) {
		return (n == 0 ? "" : String.format("%" + n + "s", c));
	}
	
	
	

}
