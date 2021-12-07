//Including java.util package for the Scanner.
import java.util.Scanner;

public class Pro2_170517033 {

	public static void main(String[] args) {
		//This program calculate the compound monthly interest. The program works as: User enter an input of value of principle(p), annual interest rate(r) and time(t)".  
		//Then the program calculate the compound monthly interest with the given formula below.
		//Formula:   Final Amount = (Inital Principle Balance)*(1+(Interest Rate/12))^Time
		
		//Student Name - Surname : Yasin Alper BÝNGÜL
		//Student ID : 170517033
				
		//Get input values from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter initial principle balance: ");
		double initialBalance = input.nextDouble();
		System.out.print("Enter yearly interest rate (Ex: 9.45):");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter monthly time periods (Ex: 8):");
		double time = input.nextDouble();
		
		//Declare variables
		double percentAnnualInterest = annualInterestRate / 100;//Convert in percent format
		double monthlyInterestRate = percentAnnualInterest / 12;//Monthly Interest Rate as percent format
		double totalAmount = initialBalance * Math.pow(1+monthlyInterestRate, time); // Total Amount
		double compoundInterest = totalAmount - initialBalance; //Compound Interest Rate calculation via using total balance.
		
		
		//Display the initial balance, monthly interest rate, total compond interest and final balance as 2 digits after the decimal point.
		System.out.println("\nInitial balance " + initialBalance); //Ýnitial rate display
		System.out.println("Monthly interset rate " + (int)(monthlyInterestRate*10000) / 100.0); //Monthly rate as 2 digits and as a not percent format
		System.out.println("Total compond interest " + (int)(compoundInterest * 100) / 100.0);
		System.out.println("Final Balance " + (int)(totalAmount * 100) / 100.0);
	}

}
