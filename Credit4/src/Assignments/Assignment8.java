package Assignments;
/*

Program: assignment5.java          Date: 5/17/2022


Author: Owais Saad
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput=new Scanner(System.in);//create scanner
		System.out.println("Enter a three digit number:");//ask for number
		int number = userInput.nextInt();//remember the number
		int number100 = number/100;//finds the hundred place value
		int number10 = number%100/10;//finds the tens place value
		int number1 = number%100%10/1;//finds the ones place value
		System.out.println("The number is: " + number + "\n\n");//give the number
		System.out.println("The hundreds place is: " + number100 + "\n");//give the variables
		System.out.println("The tens place value is: " + number10 +"\n");
		System.out.println("The ones place value is: " + number1);

	}

}
/*
Enter a three digit number:
57
Your Number is: 57


The hundreds place digit is: 0

The tens place digit is: 5

The ones place digit is: 7

*/