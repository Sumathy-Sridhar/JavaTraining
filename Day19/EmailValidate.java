import java.util.Scanner;
import java.util.regex.Pattern;
  
class EmailValidate
{
    public static boolean isValidEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String email;
       System.out.println("Enter Email Address to check if it is valid: ");
       email=sc.nextLine();
        if (isValidEmail(email))
            System.out.println(email + " is a valid email Address");
        else
            System.out.println(email + " is not a valid email Address");
    }
}