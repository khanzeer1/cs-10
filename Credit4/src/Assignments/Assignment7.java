package Assignments;
/*

Program: assignment6.java          Date: 5/17/2022


Author: Owais Saad
School: CHHS
Course: Computer Science 10
 

*/

import java.util.Scanner;//imports scanner

public class Assignment7
{
	public static void main(String[] args) 
	{
		 Scanner userInput = new Scanner(System.in);//uses scanner function
		 System.out.println("Enter the change in cents: ");//prints what is in the brackets.
		 int Change = userInput.nextInt();//takes users input and stores it as change.
		 int Quarters = Change / 25;//finds how many quarters there are.
		 int Dimes = Change % 25/10;//finds how many dimes there are.
		 int Nickels = Change % 25%10/5;//finds how many nickels there are.
		 System.out.println("The number of coins are: " +(Quarters+Dimes+Nickels));//prints what is in the brackets.
		 System.out.println("Quarter: " + Quarters);//prints what is in the brackets.
		 System.out.println("Dimes: "+Dimes);//prints what is in the brackets.
		 System.out.println("Nickels: "+Nickels);//prints what is in the brackets.
		 
	}
/*
Enter the change in cents: 
212
The number of coins are: 9
Quarter: 8
Dimes: 1
Nickels: 0

*/
}