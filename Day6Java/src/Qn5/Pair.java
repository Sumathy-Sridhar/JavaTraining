package Qn5;

public class Pair<K,V>{
	  private K key;
	  private V value;

	 public Pair(K key, V value) {
		 this.key=key;
		 this.value=value;
	 }
	 public static void main(String[] args) {
		//Pair<int,char> p= new Pair<>(4,'l');// Primitive Types not allowed..
		 Pair<Integer,Character> p= new Pair<>(4,'l');
		 System.out.println(p.key);
		 System.out.println(p.value);
	 }
}