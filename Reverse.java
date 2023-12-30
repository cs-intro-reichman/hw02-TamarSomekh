/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		
		//receiving word from user
		String word = "";
		word = args[0];
		
		//creating a new string for the reversed word 
		String newWord = "";
		
		//creating an integer to save the length of the word 
		int n = word.length();
		
		//going through the word from end to begining 
		//and saving every character into the new word
		for(int i = n - 1; i >= 0; i--){
			
			newWord = newWord + word.charAt(i);
		
		}
		
		//printing the new word we created
		System.out.println(newWord);
		
		//finding the middle character and printing it 
		char middleChar = ' ';
		if (word.length() % 2 == 0){
			middleChar = word.charAt(n/2);
		}
		
		System.out.println("The middle character is " + middleChar);
		
	}
}
