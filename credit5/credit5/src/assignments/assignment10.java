package assignments;
import java.util.Scanner;
public class assignment10 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);//calls scanner
			System.out.println("Please enter an integer: ");
			int int1 = input.nextInt();//prompts for user input
			int int2 = (int1 / 2);//finds even
			int ans = (int1%int2);//finds odd
			if(ans == 1)
			{
				System.out.println("The integer " +int1+" is odd");
			}
			else 
			{	
				System.out.print("The integer " +int1+" is even");	
}			
}
}
/*Screen Dump
Please enter an integer: 
13
The integer 13 is odd
*/
	 