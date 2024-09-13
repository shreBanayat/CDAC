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

Define the class TollBoothRevenueManager with fields, an appropriate constructor, getter and setter 
methods, a toString method, and business logic methods. Define the class TollBoothRevenueManagerUtil 
with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to 
test the functionality of the utility class.
*/

package org.example.demo;

import java.util.Scanner;

class TollBoothRevenueManager{
	float carRate;
	float truckRate;
	float motorcycleRate;
	int noOfCars;
	int noOfTrucks;
	int noOfMotorcycles;
	float totalRevenue;
	
	
	
	public TollBoothRevenueManager() {
		this.carRate=0.0f;
		this.truckRate=0.0f;
		this.motorcycleRate=0.0f;
		this.noOfCars=0;
		this.noOfTrucks=0;
		this.noOfMotorcycles=0;
	}
	
	public float getCarRate() {
		return carRate;
	}

	public float getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(float truckRate) {
		this.truckRate = truckRate;
	}

	public float getMotorcycleRate() {
		return motorcycleRate;
	}

	public void setCarRate(float carRate) {
		this.carRate = carRate;
	}

	public void setMotorcycleRate(float motorcycleRate) {
		this.motorcycleRate = motorcycleRate;
	}

	public void setTotalRevenue(float totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	public int getNoOfCars() {
		return noOfCars;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public int getNoOfMotorcycles() {
		return noOfMotorcycles;
	}
	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public void setNoOfMotorcycles(int noOfMotorcycles) {
		this.noOfMotorcycles = noOfMotorcycles;
	}
	
	public void setTotalevenue(float totalRevenue) {
		this.totalRevenue=totalRevenue;
	}
	
	public float getTotalRevenue() {
		return totalRevenue;
	}

	public float calculateRevenue() {
		totalRevenue=(carRate*noOfCars)+(carRate*noOfTrucks)+(motorcycleRate*noOfMotorcycles);
		return totalRevenue;
	}


	@Override
	public String toString() {
		return "TollBoothRevenueManager [noOfCars=" + noOfCars + ", noOfTrucks=" + noOfTrucks + ", noOfMotorcycles="
				+ noOfMotorcycles + "]";
	}
}

class TollBoothRevenueManagerUtil {
	private  TollBoothRevenueManager manager=new TollBoothRevenueManager();
	
	Scanner sc=new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter number of cars=");
		manager.setNoOfCars(sc.nextInt());
		
		System.out.println("Enter number of truck=");
		manager.setNoOfTrucks(sc.nextInt());
		
		System.out.println("Enter number of Motorcycle=");
		manager.setNoOfMotorcycles(sc.nextInt());
		
		System.out.println("Enter car rate=");
		manager.setCarRate(sc.nextFloat());
		
		System.out.println("Enter truck rate=");
		manager.setTruckRate(sc.nextFloat());
		
		System.out.println("Enter motorcycle rate=");
		manager.setMotorcycleRate(sc.nextFloat());
	}
	
	public void printRecord() {
		manager.calculateRevenue();
		System.out.println("Total Revenue="+manager.totalRevenue);
	}
	
	public void releaseResouce() {
		sc.close();
	}
}


public class Program {

	public static void main(String[] args) {
		 TollBoothRevenueManagerUtil util=new TollBoothRevenueManagerUtil();
		 
		 util.acceptRecord();
		 util.printRecord();
		 util.releaseResouce();
	}

}
