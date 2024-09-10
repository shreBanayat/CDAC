/*3. BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI). The system should:
1.	Accept weight (in kilograms) and height (in meters) from the user.
2.	Calculate the BMI using the formula:
o	BMI Calculation: BMI = weight / (height * height)
3.	Classify the BMI into one of the following categories:
o	Underweight: BMI < 18.5
o	Normal weight: 18.5 ≤ BMI < 24.9
o	Overweight: 25 ≤ BMI < 29.9
o	Obese: BMI ≥ 30
4.	Display the BMI value and its classification.
Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI & printRecord and test the functionality in main method.
*/

import java.util.Scanner;

class BMITracker{
	Scanner sc=new Scanner(System.in);
	float weight;
	float height;
	float BMI;
	
	public void acceptRecord() {
		System.out.println("Enter weight: ");
		weight=sc.nextFloat();
		
		System.out.println("Enter height: ");
		height=sc.nextFloat();
	}
	
	public void calculateBMI() {
		BMI= weight/(height*height);
	}
	
	public void printRecord() {
		if(BMI<18.5) System.out.println(BMI+"\tUnderweight");
		else if(BMI >=18.5 && BMI < 24.9)System.out.println(BMI+"\tNormal Weight");
		else if(BMI >=25 && BMI < 29.9)System.out.println(BMI+"\tOverweight");
		else if(BMI >=30) System.out.println(BMI+"\tObese");
	}
	
	
}


public class Main {
	public static void main(String[] args) {
		BMITracker tracker=new BMITracker();
		
		tracker.acceptRecord();
		tracker.calculateBMI();
		tracker.printRecord();
		tracker.sc.close();
	}
	
}
