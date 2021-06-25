package ExceptionHandlers;

public class Student {
	 int rollNo;
	 String Studentname;
    int marks;
	public Student(int rollNo, String Studentname, int marks) {
		super();
		this.rollNo = rollNo;
		this.Studentname = Studentname;
		this.marks = marks;
	}
	public void marksValidation() throws MarkException
   {	
   	if(marks > 100)
   	{
   		String e="Entered Value of Mark has Exceeded the Mark Limit";
   		throw new MarkException(e);
   	}
   	else if(marks<=0)
   	{
   		String e="Marks cannot hold negative values";
   		throw new MarkException(e);
   	}
   	else
   	{
   		System.out.println("Student Record: \n RollNo: "+rollNo+"\n Name: "+Studentname+"\n Marks: "+marks);
   	}
   }


}
