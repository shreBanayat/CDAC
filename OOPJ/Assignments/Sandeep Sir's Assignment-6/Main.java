
public class Main {

	public static int maximumElement(int[] arr) {
	int maxElemet=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=maxElemet) {
			maxElemet=arr[i];
		}
	}
	return maxElemet;
	}
	
	public static int minimumElement(int[] arr) {
		int minElement=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=minElement) {
				minElement=arr[i];
			}
		}
		return minElement;
	}
	
	public static void main(String[] args) {
		int[] intArray= {22,51,44,63,32,14};
		
		System.out.println("Maximum elemet from the array is="+Main.maximumElement(intArray));
		System.out.println("Minimum elemet from the array is="+Main.minimumElement(intArray));
		

	}

}
