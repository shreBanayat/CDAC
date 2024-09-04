//5)Write a program that allows the user to select a shape (Circle, Square, Rectangle,
// Triangle) and then calculates the area based on user-provided dimensions using a 
//switch case.
import java.util.Scanner;

public class Assignment2_Q5{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice=(-1);
        while(choice!=0){
            System.out.println("1 -Circle\n2 -Square\n3 -Rectangle\n4 -Triangle\n0 -exit");
            System.out.println("Enter your choice");
            choice=scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter radius of circle:");
                    double r=scanner.nextDouble();
                    double areaOfCircle=3.14*r*r;
                    System.out.println("Area="+areaOfCircle);
                    break;

                case 2:
                    System.out.println("Side of square:");
                    double side=scanner.nextDouble();
                    double areaOfSquare=side*side;
                    System.out.println("Area="+areaOfSquare);
                    break;

                case 3:
                    System.out.println("Enter length of rectangle:");
                    double length=scanner.nextDouble();
                    System.out.println("Enter breadth of rectangle:");
                    double breadth=scanner.nextDouble();
                    double areaOfRectangle=length*breadth;
                    System.out.println("Area="+areaOfRectangle);
                    break;

                case 4:
                    System.out.println("Enter base of triangle:");
                    double base=scanner.nextDouble();
                    System.out.println("Enter height of triangle:");
                    double height=scanner.nextDouble();
                    double areaOfTriangle=(1/2)*base*height;
                    System.out.println("Area="+areaOfTriangle);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            
        }
    }
}