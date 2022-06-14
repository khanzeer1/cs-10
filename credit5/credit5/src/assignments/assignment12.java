package assignments;

import java.util.Scanner;

public class assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a grade percentage: ");
		int grade = input.nextInt();//gets user input
		if (grade >= 90 && 100 >= grade)//sets the domain
		{
		System.out.println("The corresponding letter grade is: A+" );
		}
		else if (grade >= 80 && 89 >= grade)
		{
		System.out.println("The corresponding letter grade is: A" );
		}
		else if (grade >= 75 && 79 >= grade) 
		{
		System.out.println("The corresponding letter grade is: B+" );
		}
		else if (grade >= 70 && 74 >= grade) 
		{
		System.out.println("The corresponding letter grade is: B" );
		}
		else if (grade >= 65 && 69 >= grade) 
		{
		System.out.println("The corresponding letter grade is: C+" );
		}
		else if (grade >= 60 && 64 >= grade) 
		{
		System.out.println("The corresponding letter grade is: C" );
		}
		else if (grade >= 55 && 59 >= grade) 
		{
		System.out.println("The corresponding letter grade is: D+" );
		}
		else if (grade >= 50 && 54 >= grade) 
		{
		System.out.println("The corresponding letter grade is: D" );
		}
		else if (grade<50) 
		{
		System.out.println("The corresponding letter grade is: F" );
		}
}

}


/* screen dump
 
 Enter a grade percentage: 
50
The corresponding letter grade is: D
 
*/
