

public class MyOwnClass {
    int empid;
    String empname;

	public MyOwnClass(int empid,String empname){
	this.empid=empid;
    this.empname=empname;
    }
	
	@Override
	public String toString() {
		return "Employee Id= " + empid + ", Employee Name= " + empname + "";
	}

}
