import java.util.*;
public class HashTableEx{
    public static void main(String[] args){
        Hashtable<String,Double> ht=new Hashtable<String,Double>();
        ht.put("Sumathy", 75000.00);
        ht.put("Mathew",5000.25);
        ht.put("John",25000.00);
        ht.put("Laara",8000.25);
        System.out.println(ht);
        Set<String> keys=ht.keySet();
        Iterator<String> itr=keys.iterator();
        while(itr.hasNext()){
            String str=itr.next();
            System.out.println("Key: "+str+ " Value: "+ht.get(str));
        }
    }
}