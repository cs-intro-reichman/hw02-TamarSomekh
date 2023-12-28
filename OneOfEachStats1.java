/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		boolean girl = false;
		boolean boy = false;
		
		int T = Integer.parseInt(args[0]);
		double avg = 0;
		int children = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int childSum = 0;
		
		String str = "";
		char g = 'g';
		char b = 'b';
		
		for(int i = 0; i < T; i++){
			girl = false;
			boy = false;
			children = 0;
			do{
				if(Math.random() < 0.5){
					girl = true;
					children = children + 1;
				}
				else{
					boy = true;
					children = children + 1;
				}
				
			}while((girl != true) || (boy != true));
			
			if(children == 2){
				two = two +1;
			}else if(children == 3){
				three = three +1;
			}else if(children >= 4){
				four = four +1;
			}
			
			childSum = childSum + children;
		
		}
		
		avg = (Double.valueOf(childSum) / Double.valueOf(T));
		
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two );
		System.out.println("Number of families with 3 children: " + three );
		System.out.println("Number of families with 4 or more children: " + four );
		
		if(two > three && two > four){
			System.out.println("The most common number of children is 2.");
		}else if(three > two && three > four){
			System.out.println("The most common number of children is 3.");
		}else if(four > two && four > three){
			System.out.println("The most common number of children is 4 or more.");
		}
		
	}
}
