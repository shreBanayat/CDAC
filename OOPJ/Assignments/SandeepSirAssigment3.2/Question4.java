/*4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. 
The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define class DiscountCalculator with methods acceptRecord, calculateDiscount & 
printRecord and test the functionality in main method.
*/
import  java.util.Scanner;

class DiscountCalculator{
	Scanner sc=new Scanner(System.in);
	float originalPrice;
	float discountRate;
	float discountAmount;
	float finalPrice;
	
	public void acceptRecord() {
		System.out.println("Enter Original Price=");
		originalPrice=sc.nextFloat();
		
		System.out.println("Enter discount rate=");
		discountRate=sc.nextFloat();
	}
	
	public void calculateDiscount() {
		discountAmount = originalPrice * (discountRate / 100);
		finalPrice = originalPrice - discountAmount;
	}
	
	public void printRecord(){
		System.out.printf("Discount Amount=%.2f",discountAmount);
		System.out.printf("\nFinal Price=%.2f",finalPrice);
	}
}
public class Question4 {

	public static void main(String[] args) {
		DiscountCalculator dc=new DiscountCalculator();
		
		dc.acceptRecord();
		dc.calculateDiscount();
		dc.printRecord();
		dc.sc.close();
	}

}
