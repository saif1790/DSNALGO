package ValidationUtilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

  public static void main(String[] args) {

     String regex = "^[A-Za-z0-9]+[A-Za-z0-9]?[A-Za-z0-9]+@[A-Za-z0-9.-]+$";
     String email = "saif.tech1790@gmail.com";
    boolean matches = email.matches(regex);
    if(matches) System.out.println("it is valid email :"+email);
    else System.out.println("It is not valid email :"+email);
    /*String reg = "bb";
    int count = 0;
    Pattern pattern = Pattern.compile(reg);
    Matcher matcher = pattern.matcher("ababbabbaab");

    while(matcher.find())
    {
      count++;
      System.out.println(matcher.start()+"..."+matcher.end()+"..."+matcher.group());
    }
    System.out.println("Number of Occurence :"+count);*/
  }
}
