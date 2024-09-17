import java.util.Arrays;

public class Main3 {
	
	 public static int removeDuplicates(int[] arr) {
	        if (arr.length == 0) {
	            return 0;
	        }
	        Arrays.sort(arr);
	        int j = 0;

	        for (int i = 1; i < arr.length; i++) {
	           
	            if (arr[i] != arr[j]) {
	                j++;
	                arr[j] = arr[i]; 
	            }
	        }

	        return j + 1; 
	    }

	public static void main(String[] args) {
		int arr[] = {20,50,20,30,40,30,50,50,10}; 

		Main3 m = new Main3(); 
        int length = m.removeDuplicates(arr);  
        
        System.out.println("Array elements=");
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
	}
}

  