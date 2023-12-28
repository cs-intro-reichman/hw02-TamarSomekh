
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		boolean girl = false;
		boolean boy = false;
		String str = "";
		char g = 'g';
		char b = 'b';
		
		do{
			if(Math.random() < 0.5){
				girl = true;
				str = str + g;
			}
			else{
				boy = true;
				str = str + b;
			}
		
		}while((girl != true) || (boy != true));
		
		System.out.println(str);
		System.out.println("You made it... and you now have " + (str.length()) + " children.");
	}
}
