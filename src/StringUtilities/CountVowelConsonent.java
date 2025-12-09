package StringUtilities;

import java.util.HashMap;
import java.util.Map;

public class CountVowelConsonent {

  public static void main(String[] args) {

    String name = "elephantEA";
    Map<Character, Integer> map = countVowelAndConsonent(name);
    System.out.println("Number of Vowel :"+map.get('V'));
    System.out.println("Number of Consonant :"+map.get('C'));
  }

  public static Map<Character,Integer> countVowelAndConsonent(String name) {

    Map<Character,Integer> map = new HashMap<>();
    int countVowel = 0;
    int countConsonent = 0;
    for(int i=0; i<name.length(); i++)
    {
      char c = name.charAt(i);
      if("aeiou".indexOf(Character.toLowerCase(c)) != -1)
        countVowel++;
      else countConsonent++;
    }
    map.put('V',countVowel);
    map.put('C',countConsonent);
    return map;
  }
}
