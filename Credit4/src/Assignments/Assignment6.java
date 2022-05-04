package Assignments;
/*

Program: FromMeToYou.java          Date: 4/11/2022


Author: Owais Saad
School: CHHS
Course: Computer Science 10
 

*/
	import java.util.Scanner;//imports scanner function.

	public class Assignment6 {


	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//uses scanner function.
		  
		 System.out.println("What is your first name? ");
		 String Fname = input.nextLine();//allows user to add input. 
		 System.out.println("What is your last name? ");
		 String Lname = input.nextLine();//allows user to add input.
		 System.out.println("What grade are you in? ");
		 int grade = input.nextInt();//allows user to add input.  
		 input.nextLine();   	  
		 System.out.println("What school do you attend? ");
		 String school = input.nextLine();//allows user to add input.  
		 System.out.println("What is your favourite hobby? ");
		 String hobby = input.nextLine();//allows user to add input.  
		 System.out.println("Hello, your name is "+Fname+" "+Lname+", you are in Grade "+grade+" at "+school+". Your favourite hobby is "+hobby);//shows a scentence with all the variables added in. 
	}
/*
 What is your first name? 
owais
What is your last name? 
saad
What grade are you in? 
10
What school do you attend? 
cresent heights
What is your favourite hobby? 
soccer
Hello, your name is owais saad, you are in Grade 10 at cresent heights. Your favourite hobby is soccer
 */
}
