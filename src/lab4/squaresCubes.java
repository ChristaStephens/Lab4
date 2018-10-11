package lab4;

import java.util.Formatter;
import java.util.Scanner;

public class squaresCubes {

	public static void main(String[] args) {
		// Goal is to pair a program (worked with Adan), and display a table of powers.
		// Prompt the user to enter an integer
		// Display a table of squares and cubes from 1, to the value entered

		// Pair a program and display a table of powers.
		// Prompt the user to enter an integer
		// Display a table of squares and cubes from 1, to the value entered

		Scanner scnr = new Scanner(System.in);
		String Name;
		String userContinue = "yes";

		System.out.println("Well hello there! Please enter your name.");
		Name = scnr.nextLine();
		System.out.println("Thank you " + Name + "!");
		System.out.println("How's about we get started by finding the squares and cubes of the number that you enter "
				+ Name + "?");
		System.out.println(" ");
		do {
			System.out.println("Please enter a number");
			int number = scnr.nextInt();
			Formatter fmt;
			
			 System.out.println("Number Square  Cube");
	           System.out.println("======  ====  =====");
	           
			for (int i = 1; i <= number; ++i) {
				fmt = new Formatter();
				
		           
				// found this dope format scanner online, looks similar to
				// css/html (what I'm used to for creating boxes)
				 fmt.format("%4d %5d %6d", i, i * i, i*i*i);
		         System.out.println(fmt);

			}
			System.out.println("Would you like to continue?");
			userContinue = scnr.next();
		} while (userContinue.equals("yes"));
		 System.out.println("Goodbye " + Name +"!");

	       scnr.close();
	}

}
