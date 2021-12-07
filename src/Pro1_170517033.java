//Including java.util package for the Scanner.
import java.util.Scanner;

public class Pro1_170517033 {

	public static void main(String[] args) {
		//This java program converts the date which is entered in days. At the and of the run program, day returns as “Year: <years>, Mount: <mounts>, Day: <days>” format.
		//Student Name - Surname : Yasin Alper BÝNGÜL
		//Student ID : 170517033
		
		//Getting an input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Number of days : ");
		int days = input.nextInt();
		
		//Declaring the variables
		int currentYears, currentMonths, currentDays;
		int remainDays;
		
		//Calculating the years, months, days
		currentYears = days / 365; //Calculating the years
		remainDays = days % 365; //Remain days after calculating the years.
		currentMonths = remainDays / 31; //Calculating the months.
		remainDays %= 31; //Remain days after calculating the months.
		currentDays = remainDays; //The last remainDays give us  our remained days.
		
		//Display the calculated program 
		System.out.println("Year: " + currentYears + ", Month: " + currentMonths + ", Day: " + currentDays);
		
	}

}
