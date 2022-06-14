package assignments;

import java.text.NumberFormat;
import java.util.Scanner;

public class assignment13 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);//brings in scanner
		NumberFormat dc = NumberFormat.getCurrencyInstance();
		
		System.out.println("Enter the number of copies to be printed: ");
		int num = input.nextInt();//allows the user input
		
		if (num >= 0 && 99 >= num)//minimum and maximum of input.
		{
			System.out.println("Price per copy: $0.30");
			double num1 = (num*0.30);//finds the price
			System.out.println("Total cost is: "+dc.format(num1));//changes the format to money
		}
		else if (num >= 100 && 499 >= num)
		{
			System.out.println("Price per copy: $0.28");
			double num2 = (num*0.28);	
			System.out.println("Total cost is: "+dc.format(num2));
		}
		else if (num >= 500 && 749 >= num) 
		{
			System.out.println("Price per copy: $0.27");
			double num3 = (num*0.27);	
			System.out.println("Total cost is: "+dc.format(num3));
		}
		else if (num >= 750 && 1000 >= num)
		{
			System.out.println("Price per copy: $0.26");
			double num4 = (num*0.26);	
			System.out.println("Total cost is: "+dc.format(num4));
		}
		else if (num > 1000) 
		{
			System.out.println("Price per copy: $0.25");
			double num5 = (num*0.25);
			System.out.println("Total cost is: "+dc.format(num5));
		}
	}
}

/*screen dump
 Enter the number of copies to be printed: 
50
Price per copy: $0.30
Total cost is: $15.00

*/
