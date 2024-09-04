//3)Write a program that checks if a person is eligible to vote based on their age.
import java.util.Scanner;
public class Assignment2_Q3{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int age;
    System.out.println("Enter your age:");
    age=scanner.nextInt();
    if(age>=18){
        System.out.println("You are eligible to vote.");
    }else
    System.out.println("You are not eligible to vote.");
    }
}