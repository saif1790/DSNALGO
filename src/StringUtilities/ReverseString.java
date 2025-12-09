package StringUtilities;

public class ReverseString {

  public static void main(String[] args) {

    String name = "saif alam";
    System.out.println("Before Reverse String :"+name);
    reverseString(name);
  }

  public static void reverseString(String name) {
    String[] words = name.split(" ");
    int length = words.length;
    int nameLength = name.length();
    StringBuilder result = new StringBuilder();
    for(int i=nameLength-1; i>=0; i--)
    {
      result.append(name.charAt(i));
    }
    System.out.println("After Reverse String :"+result);
  }
}
