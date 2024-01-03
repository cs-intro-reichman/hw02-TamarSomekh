/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		
		//recieving number from user
		int n = 0;
		n = Integer.parseInt(args[0]);
		
		//using the number for the size of the board
		for(int i = 1; i <= n; i++){
			
			if(i%2==0){
				for(int j = 1; j <= n; j++){			

					System.out.print(" *");
				
				}
			}else{
			
				for(int j = 1; j <= n; j++){			

					System.out.print("* ");
				
				}
			}
			System.out.println();
			
			
		}
	}
}
