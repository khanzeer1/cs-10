package assignments;

import java.util.Scanner;

public class assignment11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);//calls in scanner
		System.out.print("Please enter any three digits: ");
		int digits = input.nextInt();//it lets the user input
		int num1 = digits/100;//finds the first digit
		int num2 = digits%100/10;//finds the second digit
		int num3 = digits%100%10;//finds the third digit
		if (num1 >= num2 && num1 >= num3)//finds the domain
			System.out.println("The biggest of the digits are: "+ num1);
		else if (num2 >= num1 && num2 >= num3)
			System.out.println( "The biggest of the three are: "+num2);
		else
			System.out.println("The biggest of the digits are: "+ num3 );
		if (num1 <= num2 && num1 <= num3)//finds the domain
			System.out.println("The least of the three digits are:"+ num1);
		else if (num2 <= num1 && num2 <= num3)
			System.out.println( "The least of the three digits are: "+num2 );
		else
			System.out.println( "The least of the three digits are: "+num3 );
		System.out.println("The sum of the three digits are: " + (num1+num2+num3));
		System.out.println("The product of the three digits are: "+ (num1*num2*num3));
		System.out.println("The avg of the three digits are: "+ (num1+num2+num3)/3);
}
}

/*screen dump
 Please enter any three digits: 347
The biggest of the digits are: 7
The least of the three digits are:3
The sum of the three digits are: 14
The product of the three digits are: 84
The avg of the three digits are: 4

 */
