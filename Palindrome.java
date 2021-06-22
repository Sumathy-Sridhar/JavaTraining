import java.util.Scanner;
public class Palindrome{
	
public static void main(String[] args) {

  
	  int count=0;
    
	String arr[]={"sumathy","madam","sridhar","malayalam"};
	
	for(int j=0;j<arr.length;j++)
   {
          
		String original, reverse = ""; 
       
		   Scanner in = new Scanner(System.in);       

			original=arr[j];  
     
		     int length = original.length();   
     
		     for ( int i = length - 1; i >= 0; i-- )  
 
		            reverse = reverse + original.charAt(i); 
		 
        if (original.equals(reverse))  

		             count++;       
       }  
  
 System.out.println("The no. of palindrome strings : "+ count);
  }
}