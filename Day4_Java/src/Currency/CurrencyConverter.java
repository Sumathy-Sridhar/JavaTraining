package Currency;

import java.util.Scanner;

public class CurrencyConverter {
	String from , To;
	double value, result;
	Scanner sc=new Scanner(System.in);
	
	public void getValue() {
		System.out.println("Enter the Conversion Type: (inr,usd,yen,euro)");
		System.out.println("Convert From: ");
		from=sc.nextLine();
		System.out.println("Convert TO: ");
		To=sc.nextLine();
		System.out.println("Enter the value to convert : ");
		value=sc.nextDouble();
	}
	
	public void InrToUsedConverter() {
		String f=from.toLowerCase();
		String t=To.toLowerCase();
		if ((f.equals("inr")) && (t.equals("usd")) ){
			result=value/74.17;
			System.out.println("Value of " +value + " Rupees in Usd= " +result);
		}
		else if ((f.equals("usd")) && (t.equals("inr")) ){
			result=value*74.17;
			System.out.println("Value of " +value + " Usd in Rupees= " +result);
		}
		else if ((f.equals("inr")) && (t.equals("euro")) ){
			result=value/86.68;
			System.out.println("Value of " +value + " Rupees in Euro= " +result);
		}
		else if ((f.equals("euro")) && (t.equals("inr")) ){
			result=value*86.68;
			System.out.println("Value of " +value + " Euro in Rupees= " +result);
		}
		else if ((f.equals("inr")) && (t.equals("yen")) ){
			result=value/0.67;
			System.out.println("Value of " +value + " Rupees in Yen= " +result);
		}
		else if ((f.equals("yen")) && (t.equals("inr")) ){
			result=value/74.17;
			System.out.println("Value of " +value + " Yen in Rupees= " +result);
		}
	}
}
