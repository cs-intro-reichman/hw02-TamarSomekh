/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		
		//creating the first random num 
		int num1 = (int) (Math.random() * 10);
		int num2 = num1;
		
		//the loop prints the first number
		//creats another random num
		//and does that only while the last num is smaller than the previous
		do{
			
			System.out.print(num2 + " ");	
			num1 = num2;
			num2 = (int) (Math.random() * 10);
					
		}while(num2 >= num1);
		
	}
}
