/*
 Name:Evan White

 OBJECTIVES:
 Declaring and Initializing variables
 Using interactive, keyboard input
 Using assignment statements
 Coding output (print) statements
*/

//TODO:  1.  import the necessary package that allows for keyboard input
	import java.util.Scanner;


 public class CreatingApplication
 {
 	public static void main (String[] args)
 	{
		//TODO:  2.  Instantiate the object that you will use for keyboard input.
		Scanner input = new Scanner(System.in);
		//input
		System.out.print("\n3. Enter your first name:      ");
		
 		//TODO:  3.  Declare a String variable and enter a single word at the keyboard.
		  String firstName = input.next();

		System.out.print("\n4. Enter your middle initial:      ");
 		//TODO:  4.  Use the char data type
		//char initial = ---.next().charAt()
		 char initial = input.next().charAt(0);

		System.out.print("\n5. Enter your last name:      ");
 		//TODO:  5. Declare a String variable and enter a single word.
		 String lastName = input.next();
		  input.nextLine();
		  
		System.out.print("\n6. Enter your birthday (mm/dd/yyyy format):      ");
 		//TODO:  6.  Declare a String variable and enter a single String.
		 String birthday = input.nextLine();

		System.out.print("\n7. Enter your gender:      ");
 		//TODO:  7.  Use the char data type
		 char gender = input.next().charAt(0);

		System.out.print("\n8. Enter your id number:    ");
 		//TODO:  8.  Declare a String variable and enter a single String.
		 String id = input.next();
		  input.nextLine();
		  
		System.out.print("\n9. Enter your street address:    ");
 		//TODO:  9.  Declare a String variable and enter several String(s).
		 String address = input.nextLine();

		System.out.print("\n10. Enter city, ST Zip:    ");
 		//TODO:  10. Declare a String variable and enter several String(s).
		 String city = input.nextLine();

		System.out.print("\n11. Enter your grade (9, 10, 11, 12):    ");
 		//TODO:  11.  Declare an int and input an integer.
		 int grade = input.nextInt();
		 input.nextLine();

		System.out.print("\n12. Enter your high school:    ");
 		//TODO:  12. Declare a String variable and enter several String(s).
		 String school = input.nextLine();

		System.out.println();
		//Output
		//TODO:  13. Print the values from steps 3 to 12.  Be sure to label each item.
		//Put your complete name on one line.  All other items are on different lines.
		
			System.out.println("Name :     " + firstName + " " + initial + " " + lastName);
			System.out.println("Birthday : " + birthday);
			System.out.println("Gender :   " + gender);
			System.out.println("Id :       " + id);
			System.out.println("Address :  " + address);
			System.out.println("City :     " + city);
			System.out.println("Grade :    " + grade);
			System.out.println("School :   " + school);
 	}
 }





