import java.util.*;

public class GroupAnagram {

  public static void main(String[] args) {

    String[] strs = {"a"};
    List<List<String>> lists = groupAnagrams(strs);
    System.out.println(lists);

  }

  public static List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    for (String s : strs) {
      char[] charArray = s.toCharArray();
      Arrays.sort(charArray);
      String key = new String(charArray);
      map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
    }
    return new ArrayList<>(map.values());
  }
}
