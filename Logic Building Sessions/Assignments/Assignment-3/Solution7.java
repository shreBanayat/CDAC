//7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
//30 (9 + 8 + 7 + 6).

public class Solution7{
	public static void main(String args[]){
		int rem=0,num=9876,sum=0;
		
		while(num!=0){
		rem=num%10;
		sum=sum+rem;
		System.out.println(sum);
		num=num/10;
		}
		System.out.println(sum);
	}
}