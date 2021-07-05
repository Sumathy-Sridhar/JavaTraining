import java.util.*;
public class HashSetEx {
    public static void main(String[] args)
	{
		HashSet<ArrayList> hs=new HashSet<>();
		
		ArrayList<String> arr1=new ArrayList<>();
        arr1.add("Cony");
        arr1.add("Brown");
        arr1.add("John");
        arr1.add("Mathew");
        arr1.add("Sumathy");
    		
		ArrayList<MyOwnClass> arr2=new ArrayList<>();
		arr2.add(new MyOwnClass(101,"Delvin"));
		arr2.add(new MyOwnClass(120,"Jeshru"));
		arr2.add(new MyOwnClass(103,"Aishu"));
		
		ArrayList<Integer> arr3=new ArrayList<>();
		arr3.add(15);
		arr3.add(62);
		arr3.add(854);
		arr3.add(112);
		arr3.add(100);
		
		hs.add(arr1);
        hs.add(arr2);
        hs.add(arr3);
        System.out.println("Elements of Hashset:");
        Iterator itr = hs.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();
	}
}
