//4)Write a program that takes a month (1-12) and prints the corresponding season
// (Winter, Spring, Summer, Autumn) using a switch case

import java.util.Scanner;

public class Assignment2_Q4{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int month;
    System.out.println("Enter a month (1-12)");
    month=scanner.nextInt();
    switch(month)
    {
    case 12,1,2:
        System.out.println("Winter");
        break;
    case 3,4,5:
        System.out.println("Spring");
        break;
    case 6,7,8:
        System.out.println("Summer");
        break;    
    case 9,10,11:
        System.out.println("Fall");
        break;    
    default:
        System.out.println("Invalid month");
    }
    }
}