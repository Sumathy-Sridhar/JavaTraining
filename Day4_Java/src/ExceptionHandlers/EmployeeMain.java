package ExceptionHandlers;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws PayException {
		Scanner sc=new Scanner(System.in);
		System.out.println("USER DEFINED EXCEPTION HANDLING");	
		System.out.println("Enter Employee No: ");
		int en=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String ename=sc.next();
		System.out.println("Enter Basic Pay: ");
		int basicpay=sc.nextInt();
		Employee e=new Employee(en,ename,basicpay);
		e.calcBasicPay();

sc.close();
	}

}
