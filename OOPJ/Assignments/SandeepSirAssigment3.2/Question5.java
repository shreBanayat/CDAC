/*5. Toll Booth Revenue Management
Develop a system to simulate a toll booth for collecting revenue. The system should:
1.	Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
2.	Accept the number of vehicles of each type passing through the toll booth.
3.	Calculate the total revenue based on the toll rates and number of vehicles.
4.	Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).
•	Toll Rate Examples:
o	Car: ₹50.00
o	Truck: ₹100.00
o	Motorcycle: ₹30.00
Define class TollBoothRevenueManager with methods acceptRecord, setTollRates, calculateRevenue & 
printRecord and test the functionality in main method.
*/
import java.util.Scanner;

class TollBoothRevenueManager{
	Scanner sc=new Scanner(System.in);
	float carRate;
	float truckRate;
	float motorcycleRate;
	int noOfCars;
	int noOfTrucks;
	int noOfMotorcycles;
	float totalRevenue;
	
	public void acceptRecord() {
		System.out.println("Enter number of cars=");
		noOfCars=sc.nextInt();
		
		System.out.println("Enter number of truck=");
		noOfTrucks=sc.nextInt();
		
		System.out.println("Enter number of Motorcycle=");
		noOfMotorcycles=sc.nextInt();
	}
	
	public void setTollRates() {
		this.carRate=50.00f;
		this.truckRate=100.00f;
		this.motorcycleRate=30.00f;
	}
	
	public void calculateRevenue() {
		totalRevenue=(carRate*noOfCars)+(carRate*noOfTrucks)+(motorcycleRate*noOfMotorcycles);
	}
	
	public void printRecord() {
		System.out.println("Total Revenue="+totalRevenue);
	}

}

public class Question5 {
	public static void main(String[] args) {
		TollBoothRevenueManager tbrm=new TollBoothRevenueManager();
		
		tbrm.acceptRecord();
		tbrm.setTollRates();
		tbrm.calculateRevenue();
		tbrm.printRecord();
		
		tbrm.sc.close();
	}
}
