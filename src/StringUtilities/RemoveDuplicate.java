package StringUtilities;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

  public static void main(String[] args) {

    String name = "elephant";
    removeDuplicate(name);
  }

  public static void removeDuplicate(String name) {

     StringBuilder builder = new StringBuilder();
     for(int i=0; i<name.length(); i++)
     {
       char c = name.charAt(i);
       if(builder.indexOf(String.valueOf(c)) == -1)
       {
         builder.append(c);
       }
     }
    System.out.println(builder.toString());

    }
}
