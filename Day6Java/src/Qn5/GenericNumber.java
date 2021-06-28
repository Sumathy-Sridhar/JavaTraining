package Qn5;

public class GenericNumber {
	T ob;
	  T vals[];

	  GenericNumber(T o, T[] nums) {
	    ob = o;
	    vals = nums;
	  }

	  public static void main(String args[]) {
	    Integer n[] = { 1 };
	    GenericNumber<Integer> obj = new GenericNumber<Integer>(50, n);
	    // Can't create an array of type-specific generic references.
	    // GenericNumber<Integer> gens[] = new GenericNumber<Integer>[10]; 
	    GenericNumber<?> gens[] = new GenericNumber<?>[10]; // OK
	  }
}
