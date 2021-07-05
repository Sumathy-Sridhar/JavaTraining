import java.util.*;
public class Movemin {
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arrlist=new ArrayList<>();
		System.out.println("Enter Size: ");
		int n=sc.nextInt();
		System.out.println("Enter Arraylist elements: ");
		for(int i=0;i<n;i++) 
		{
			arrlist.add(sc.nextInt());
		}
		int min=arrlist.get(0);
		int mindex=0;
		for(int i=0;i<n;i++)
		{
			if(arrlist.get(i)<min)
			{
				min=arrlist.get(i);
				mindex=i;
			}
		}
		arrlist.remove(mindex);
		arrlist.add(0,min);
		System.out.println("Elements of Arraylist After Re-arranging : "+arrlist);
	}  
}
