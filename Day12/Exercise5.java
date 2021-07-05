import java.util.*;
public class Exercise5 {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<>();
		arr.add("Cony");
        arr.add("Brown");
        arr.add("John");
        arr.add("Mathew");
        arr.add("Sumathy");
        System.out.println("ArralyList Elements: "+arr);
		for(String i:arr) 
		{
			int l=i.length();
			if(l%2==0) 
			{
				arr.remove(i);
			}
		}
		System.out.println("After Remove Operation: "+arr);
    }
}
