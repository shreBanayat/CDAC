/*1. Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.*/

package com.assignments.first;

import java.util.Scanner;

class LoanAmortizationCalculator{
	Scanner sc=new Scanner(System.in);
	float principalAmount;
	float annualInterestRate;
	int loanTerm;
	float monthlyPayment;
	
	
	public void acceptRecord() {
		System.out.println("Enter principal amount=");
		this.principalAmount=sc.nextFloat();
		
		System.out.println("Enter Annual Intrest rate=");
		this.annualInterestRate=sc.nextFloat();
		
		System.out.println("Enter loan term="); 
		this.loanTerm=sc.nextInt();
		
	}
	
	public void calculateMonthlyPayment(){
		float monthlyInterestRate = annualInterestRate / 12 / 100;
		int numberOfMonths = loanTerm * 12;
		monthlyPayment =(float) ( principalAmount * (monthlyInterestRate *( Math.pow((1 + monthlyInterestRate), (numberOfMonths))) ) / ((Math.pow((1 + monthlyInterestRate), (numberOfMonths))) - 1));	
	}
	
	
	public void printRecord() {	
		System.out.println("Monthly Payment="+monthlyPayment);		
	}
	
}


public class LoanCalculator {

	public static void main(String[] args) {
		LoanAmortizationCalculator loanCalculator=new LoanAmortizationCalculator();
		
		loanCalculator.acceptRecord();
		loanCalculator.calculateMonthlyPayment();
		loanCalculator.printRecord();
		loanCalculator.sc.close();

	}

}
