//5.Write a program to find the intersection of two single-dimensional arrays
public class Program {
	
	public static void main(String[] args) {
		int[] array1= {11,22,33,44,55,66,77};
		int[] array2= {22,23,55,56,78,8};
		int[] newArray=new int[array2.length];
		int k=0;

			for(int i=0;i<array1.length;i++) {
			
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					
					newArray[k]=array1[i];
					k++;
				}
			}
			
		}
				System.out.println("Array elements=");
				for(int i=0;i<newArray.length;i++) {
					if(newArray[i]==0) {
						continue;
					}
					System.out.println(newArray[i]);
				}	
	}

}
