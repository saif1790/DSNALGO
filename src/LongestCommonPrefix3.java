import java.util.Arrays;

public class LongestCommonPrefix3 {

        public static String longestCommonPrefix(String[] s) {
            Arrays.sort(s);//["flight","flow","flower"]
            StringBuilder sb = new StringBuilder();
            char[] firstWord = s[0].toCharArray();//[f,l,i,g,h,t]
            char[] lastWord =  s[s.length-1].toCharArray();//[f,l,o,w,e,r]\

            //comparing the character from both i.e firstWord and lastWord
            for(int i=0;i<firstWord.length;i++)
            {
                if(firstWord[i] != lastWord[i])
                    break;
                sb.append(firstWord[i]);
            }
            return  sb.toString();
        }
        public static void main(String[] args) {
            // Your code goes her
            String[] s = {"flower", "flow", "floght"};

            System.out.println("Longest common prefix in given array :"+longestCommonPrefix(s));
        }
}
