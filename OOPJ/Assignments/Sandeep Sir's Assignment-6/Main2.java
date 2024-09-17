
public class Main2 {
	
	public static void acceptRecord(int[] arr) {
		System.out.println("Enter elements=");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}

	public static void printRecord(int[] arr) {
		System.out.println("Array elements=");
		for(int i=0;i<arr.length;i++) 
			System.out.println(arr[i]);
		}	
	}
	
	public static void main(String[] args) {
	int[] intArray=new int[5];
	Main.acceptRecord(intArray);
	Main.printRecord(intArray);
	}

}
