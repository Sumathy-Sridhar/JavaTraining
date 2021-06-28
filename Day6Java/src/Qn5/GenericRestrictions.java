package Qn5;

class GenericRestrictions<Ty> {
	  Ty ob;

	  GenericRestrictions() {
	    ob = new Ty(); //Not possible to create instance of type parameter
	  }
}
class statgeneric{
		  static T ob;
		  static T getob() {
		    return ob; //Static method cannot use T
		  }
		  static void showob() {
		    System.out.println(ob);
		  }

	}
