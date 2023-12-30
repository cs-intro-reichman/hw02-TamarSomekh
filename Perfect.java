/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		//receiving a number from user
		int n = 0;
		n = Integer.parseInt(args[0]);
		
		int sum = 0;
		
		//creating the string of the answer
		String strOG = n + " is a perfect number since = 1";
		String str = strOG;
		
		//a loop that will add dividors to the string
		for(int i = 2; i < n; i++){
			if (n % i == 0){
				str = str + " + " + i;
				sum = sum + i;
			}
		
		}
		
		//if statemant that determines the answer
		if((sum+1) == n){
			System.out.print(str);
		}
		else{
			System.out.print(n + " is not a perfect number");
		}
	}
}
