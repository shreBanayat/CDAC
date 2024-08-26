//4. Write a program to reverse the digits of the number 1234. The output should be 4321.

public class Reverse{
	public static void main(String args[]){
	int rem=0,reverse=0,num=1234;
		
		while(num!=0){
		rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
		}
		System.out.println(reverse);
	}
}


