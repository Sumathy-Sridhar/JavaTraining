package Qn4;

interface maths <T extends Number>{
	int powerOf(T t);
 }

public class GenericInterface<T extends Number> implements maths<T> {
	public int powerOf(T i) {
		return i.intValue()*i.intValue()*i.intValue();
	}
	public static void main(String[] args) {
		GenericInterface<Number> gi=new GenericInterface<Number>();
		int res=gi.powerOf(4);
		System.out.println("Cube Value: " +res);
	}

}
