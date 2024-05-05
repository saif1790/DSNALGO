/*Solved using two pointer approach*/

public class ReversePrefixOfWord {

    public static void main(String[] args) {

        String word = "abdeexyzs";
        char prefix = 'e';
        String s = reversePrefix(word, prefix);
        System.out.println("After prefix  :" + s);
    }

    public static String reversePrefix(String word, char prefix) {
        int prefixIndex = word.indexOf(prefix);
        char[] chars = word.toCharArray();
        int first = 0;
        int end = prefixIndex;
        char temp;
        if (end < 0) {
            return word;
        }
        while (first < end) {
            temp = chars[first];
            chars[first++] = chars[end];
            chars[end--] = temp;
        }
        String newString = new String(chars);
        System.out.println("Before prefix :" + word);
        return newString;
    }
}
