//19. Write a program to print the following pattern: 

public class Solution19{
  public static void main(String[] args) {

        for(int i= 1; i<=5; i++) {
		
            for(int j=1; j<=i;j++) {
			System.out.print(j);
			if (j < i) {
                    System.out.print("*");
                }
			}    
            System.out.println();
        }
    }
}


/*
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5 
*/