package Assignments;
/*

Program: assignment6.java          Date: 4/27/2022


Author: Owais Saad
School: CHHS
Course: Computer Science 10
 

*/

	import java.util.Scanner;//imports scanner function.

	public class Assignment6 {


	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//uses scanner function.
		  
		 System.out.println("What is your first name? ");
		 String Firstname = input.nextLine();//allows user to add input. 
		 System.out.println("What is your last name? ");
		 String Lastname = input.nextLine();//allows user to add input.
		 System.out.println("What grade are you in? ");
		 int grade = input.nextInt();//allows user to add input.  
		 input.nextLine();   	  
		 System.out.println("What school do you attend? ");
		 String School = input.nextLine();//allows user to add input.  
		 System.out.println("What is your favourite hobby? ");
		 String Hobby = input.nextLine();//allows user to add input.  
		 System.out.println("Hello, your name is "+Firstname+" "+Lastname+", you are in Grade "+grade+" at "+School+". Your favourite hobby is "+Hobby);//shows a sentence with all the variables added in. 
	}
/*
 What is your first name? 
Owais
What is your last name? 
Saad
What grade are you in? 
10
What school do you attend? 
Cresent Heights
What is your favourite hobby? 
soccer
Hello, your name is owais saad, you are in Grade 10 at cresent heights. Your favourite hobby is soccer
 */
}
