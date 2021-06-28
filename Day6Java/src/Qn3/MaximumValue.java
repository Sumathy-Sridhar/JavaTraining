package Qn3;

public class MaximumValue {
		
		  public static <E extends Comparable<E>> E max(E[] list) 
		  {
			    for(int i=0;i<list.length;i++){
			    	System.out.println(" "+list[i]);
			    }
			    System.out.println();
			    
		        E max = list[0]; 
		        for (int i = 1; i < list.length; i++) 
		        {
		            if (list[i].compareTo(max) >0) 
		            {
		                max = list[i];
		            }

		        }
		        return max;
		    }
		public static void main(String[] args) 
		{
			System.out.println("Find The MAX value using Generic function");
			System.out.println("```````\n");
			Integer[] intArray= {20,10,50,8};
			Double[] doubleArray={2.5,22.8,96.25,22.0};
			String[] strArray= {"Milk","Laara","Sumathy","Mathew","Ashok","John"};
			System.out.println("Integer Array: ");
			System.out.println("\nThe Maximum Value in the IntArray: "+max(intArray));
			System.out.println("-----------------------------------");
			System.out.println("Double Array: ");
		    System.out.println("\nThe Maximum Value in the DoubArray: "+max(doubleArray));
			System.out.println("-----------------------------------");
		    System.out.println("String Array: ");
		    System.out.println("\nThe Maximum Value in the StrArray: "+max(strArray));
		}

}
