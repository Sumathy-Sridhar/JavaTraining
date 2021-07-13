import java.util.regex.*;
  import java.util.Scanner;
public class GroupMatch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str,stringToBeMatched;
        String regex = "(sd*)";
        Pattern pattern
            = Pattern.compile(regex);
       System.out.println("Enter string to be matched: ");
        stringToBeMatched=sc.nextLine();
     
        Matcher matcher
            = pattern
                  .matcher(stringToBeMatched);
        MatchResult result
            = matcher.toMatchResult();
        System.out.println("Current Matcher: "
                           + result);
  
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}