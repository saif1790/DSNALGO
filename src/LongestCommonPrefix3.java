//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".*/

import java.util.Arrays;

public class LongestCommonPrefix3 {

    public static String longestCommonPrefix(String[] s) {
        Arrays.sort(s);//["flight","flow","flower"]
        StringBuilder sb = new StringBuilder();
        char[] firstWord = s[0].toCharArray();//[f,l,i,g,h,t]
        char[] lastWord = s[s.length - 1].toCharArray();//[f,l,o,w,e,r]\

        //comparing the character from both i.e firstWord and lastWord
        for (int i = 0; i < firstWord.length; i++) {
            if (firstWord[i] != lastWord[i])
                break;
            sb.append(firstWord[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String[] s = {"flower", "flow", "floght"};

        String commonPrefixResults = longestCommonPrefix(s);
        if (commonPrefixResults.equals(""))
            System.out.println("Longest common prefix1 in given array :" + commonPrefixResults);
        else System.out.println("Longest common prefix in given array :" + commonPrefixResults);
    }

}
