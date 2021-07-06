import java.util.*;

public class ReplaceString {
    public static void main( String args[] ) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println("Enter String: ");
        System.out.println( "Initial String : "+ str);
        
        str = str.replace( "hello" , "hi" );
        System.out.println( "The String after substitution : "+str );
     }
  }

