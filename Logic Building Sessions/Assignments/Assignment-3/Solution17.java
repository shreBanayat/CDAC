//17. Write a program to print the following pattern: 
 
public class Solution17{
       public static void main(String args[]){
                int n=5;
               
                for(int i=n;i>=1;i--){
                   
                    for(int j=1;j<=n;j++){
                        if(j<=n-i){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
           
       }
}