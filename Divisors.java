/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		
		//recieving number from user
		int x = 0;
		x = Integer.parseInt(args[0]);
		
		//checkimg what are the divisors of x
		for(int i = 1; i <= x; i++){
			if (x % i == 0){
				System.out.println(i);
			}
		
		}
		
	}
}
