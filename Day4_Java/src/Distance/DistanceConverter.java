package Distance;

import java.util.Scanner;

public class DistanceConverter {
	String from , To;
	double value, result;
	Scanner sc=new Scanner(System.in);
	
	public void getValue() {
		System.out.println("Enter the Conversion Type: (mtr,km) ");
		System.out.println("Convert From: ");
		from=sc.nextLine();
		System.out.println("Convert TO: ");
		To=sc.nextLine();
		System.out.println("Enter the value to convert : ");
		value=sc.nextDouble();
	}
	public void MtrToKmConverter() {
		String f=from.toLowerCase();
		String t=To.toLowerCase();
		if ((f.equals("mtr")) && (t.equals("km")) ){
			result=value/1000;
			System.out.println("Value of " +value + " meters in Kilometeres= " +result);
		}
		else if ((f.equals("km")) && (t.equals("mtr")) ){
			result=value*1000;
			System.out.println("Value of " +value + " Kilometers in meteres= " +result);
		}
		else if ((f.equals("km")) && (t.equals("miles")) ){
			result=value/0.6213;
			System.out.println("Value of " +value + " Kilometers in Miles= " +result);
		}
		else if ((f.equals("miles")) && (t.equals("km")) ){
			result=value*0.6213;
			System.out.println("Value of " +value + " Miles in Kilometeres= " +result);
		}
	}
}