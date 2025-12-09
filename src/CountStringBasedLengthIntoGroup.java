import java.util.*;

public class CountStringBasedLengthIntoGroup {
  public static void main(String[] args) {

    String[] strings = {"cat", "dog", "elephant", "fish", "Lion", "rat", "ziraffe", "cow", "fox"};
    List<String> strings1 = Arrays.asList(strings);

    /*counts the number of strings in an array grouped by their lengths.*/
    Map<Integer, Integer> map = new HashMap<>();
    for (String s : strings1) {
      int length = s.length();
      map.put(length, map.getOrDefault(length, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println("strings of length " + entry.getKey() + ":" + entry.getValue());
    }

    /*String Value of those entries which contained length 3,4 etc*/
    Map<Integer, List<String>> map1 = new HashMap<>();
    for (String s1 : strings1) {
      int length = s1.length();
      List<String> strings2 = map1.putIfAbsent(length, new ArrayList<>());
      map1.get(length).add(s1);
      //System.out.println(add);
    }
    for (Map.Entry<Integer, List<String>> entry : map1.entrySet()) {
      Integer key = entry.getKey();
      List<String> value = entry.getValue();
      System.out.println("String value of length :" + key + ":" + value);
    }
  }
}
