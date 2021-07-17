import java.util.ArrayList;


public class LambdaExpArg {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		System.out.println("Passing LAmbda Exp as Argument...");
        names.add("Sumathy");
        names.add("Mathew");
        names.add("Brown");
        names.add("Cony");
        names.add("John");
        System.out.println("ArrayList: " + names);
        names.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + names);

	}
}