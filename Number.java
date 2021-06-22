package com.srm.training;

import java.util.Scanner;
import java.util.logging.Logger;

public class Number {
	static Logger log=Logger.getLogger(Room.class.getName());
	double num;
	public  boolean isZero(double num){
		if(num==0) {
			return true;
		}else {
			return false;
		}
	}

	public  boolean isPositive(double num){
		if(num>0) {
			return true;
		}else {
			return false;
		}
	}
	public  boolean isNegative(double num){
		if(num<0) {
			return true;
		}else {
			return false;
		}
	}
	
	public  boolean isOdd(double num){
		if(num%2!=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public  boolean isEven(double num){
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isPrime(double num) {
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	    return true;
	    else
	     return false;
	  }

	public boolean isArmstrong(double num) {
			double a,temp, sum=0.0;
			a=num;
	        while (a!= 0)
	        {
	            temp = a % 10;
	            sum = sum+ temp*temp*temp;
	            a/= 10;
	        }

	        if(sum == num)
	           return true;
	        else
	          return false;
	    }
	public void getfactorial(double num) {
		  double i,fact=1;  
		  for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }    
		  log.info("Factorial of "+num+" is: "+fact);    
		 }
	
	public double getSqrt(double num) {
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		return sqrtroot;  
		}  
	
	public double getSqr(double num) {
		double sqr=Math.pow(num, 2);
		return sqr;
	}
	
	public double sumDigits(double num) {
		double digit, sum = 0;  
		    while(num > 0)  
			{  
			    digit = num % 10;  
			    sum = sum + digit;  
			    num = num / 10;  
			}  
	return sum;  
	}
	
	public double getReverse(double num) {
		double reverse = 0;  
		while(num!= 0)   
		{  
		double remainder = num % 10.0;  
		reverse = (reverse * 10.0) + remainder;  
		num= num/10.0;  
		}  
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		log.info("Enter Number : ");
		double n=sc.nextDouble();
		Number nobj=new Number();
		boolean b=nobj.isZero(n);
		log.info("Is the given number isZero: " +b );	
		boolean p=nobj.isPositive(n);
		log.info("Is the given number isPostive: " +p);
		boolean ng=nobj.isNegative(n);
		log.info("Is the given number isNegative: " +ng);
		boolean odd=nobj.isOdd(n);
		log.info("Is the given number isOdd: " +odd);
		boolean even=nobj.isEven(n);
		log.info("Is the given number isEven: " +even);
		boolean prime=nobj.isPrime(n);
		log.info("Is the given number isPrime: " +prime);
		boolean arm=nobj.isArmstrong(n);
		log.info("Is the given number isArmstrong: " +arm);
		nobj.getfactorial(n);
		double sq=nobj.getSqrt(n);
		log.info("SqaureRoot of "+ n + " is : "+sq);
		double square=nobj.getSqr(n);
		log.info("Sqaure of " + n + "is : " +square);
		double sumdigi=nobj.sumDigits(n);
		log.info("Sum of Digits of "+ n + "is : "+sumdigi);
		double revres=nobj.getReverse(n);
		log.info("Reverse of " +n + "is: " +revres);
		sc.close();
	}

}
