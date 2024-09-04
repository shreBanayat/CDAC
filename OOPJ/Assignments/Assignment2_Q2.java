//2)Implement a program that calculates the Body Mass Index (BMI) based on height and 
//weight input using if-else to classify the BMI int categories (underweight, normal
// weight, overweight,etc).
import java.util.*;

public class Assignment2_Q2{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        float height,weight,bmi;
        System.out.println("Enter your height in meters:");
        height=scanner.nextFloat();
        System.out.println("Enter your weight in kilograms:");
        weight=scanner.nextFloat();
        
        System.out.println("bmi="+bmi);

        if(bmi<=18.4){
            System.out.println("You are underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("You are normal weight");
        }
        else if(bmi>25){
            System.out.println("You are Overweight");
        }
    }
}
