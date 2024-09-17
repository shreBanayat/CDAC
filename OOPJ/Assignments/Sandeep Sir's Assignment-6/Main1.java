
import java.util.Scanner;

public class Main1 {
	static Scanner sc=new Scanner(System.in);

	public static void printArray(int[] arr) {
		System.out.println("Array elements=");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
	
	public static void acceptArray(int[] arr) {
		System.out.println("Enter elements=");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public static void main(String[] args) {
		int[] arry=new int[5];
		
		Main1.printArray(arry);
		
		Main1.acceptArray(arry);
		Main1.printArray(arry);

	}

}
