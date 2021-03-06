package ExceptionHandlers;

public class Employee {
	int empno;
	String empName;
	double bPay;
	public Employee(int empno, String empName, double bPay) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.bPay = bPay;
	}
	public void calcBasicPay() throws PayException
	{
		if(bPay<=0 || bPay<2500)
		{
			String s="Salary cannot hold negative values nor exceed the basic pay limit..";
			throw new PayException(s);
		}
		else
		{
			System.out.println("Employee Details: \n Employee No: "+empno+"\n Employee Name: "+empName+"\n BasicPay: "+bPay);
		}
	}
}
