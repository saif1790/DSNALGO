import java.util.HashSet;
import java.util.Set;

/*Given two strings, determine if they share a common substring. A substring may be as small as one character.*/
public class CommonSubstring {

  public static void main(String[] args) {

    String s1 = "saif";
    String s2 = "samir";

    String commonSubstring = isCommonSubstring(s1, s2);
    if (commonSubstring.equals("YES"))
      System.out.println("Both string having common character");
    else
      System.out.println("Both string does not contained common character");
  }

  public static String isCommonSubstring(String s1, String s2) {

    Set<Character> set1 = new HashSet();
    Set<Character> set2 = new HashSet();

    for (char c : s1.toCharArray())
      set1.add(c);//['b','a','r','e','l']

    for (char c : s2.toCharArray())
      set2.add(c);//['t','r','a','p','e']

    /*we need common character from both set so take the intersection of both set*/

    set1.retainAll(set2);
    System.out.println(set1);
    return set1.retainAll(set2) ? "YES" : "NO";

  }
}
