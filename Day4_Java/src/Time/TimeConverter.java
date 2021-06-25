package Time;

import java.util.Scanner;

public class TimeConverter {
	String from , To;
	double value, result;
	Scanner sc=new Scanner(System.in);
	
	public void getValue() {
		System.out.println("Enter the Conversion Type: (hrs,min,sec) ");
		System.out.println("Convert From: ");
		from=sc.nextLine();
		System.out.println("Convert TO: ");
		To=sc.nextLine();
		System.out.println("Enter the value to convert : ");
		value=sc.nextDouble();
	}
	
	public void HrsToMin() {
		String f=from.toLowerCase();
		String t=To.toLowerCase();
		if ((f.equals("hrs")) && (t.equals("min")) ){
			result=value*60;
			System.out.println("Value of " +value + " Hours in Minutes= " +result);
		}
		else if ((f.equals("hrs")) && (t.equals("sec")) ){
			result=value*3600;
			System.out.println("Value of " +value + " Hours in Seconds= " +result);
		}
		else if ((f.equals("min")) && (t.equals("hrs")) ){
			result=value/60;
			System.out.println("Value of " +value + " Minutes in Hours= " +result);
		}
		else if ((f.equals("sec")) && (t.equals("hrs")) ){
			result=value/3600;
			System.out.println("Value of " +value + " Hours in Minutes= " +result);
		}
		
		
	}

}
