
public class digitsum
{  
	public static void main(String args[])  
	       {  
		int digit, sum = 0;  
		   int number=Integer.parseInt(args[0]);
		    while(number > 0)  
			{  
			    digit = number % 10;  
			    sum = sum + digit;  
			    number = number / 10;  
			}  
		System.out.println("Sum of Digits: "+sum);  
}}