import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar4 {

    public static void main(String[] args) {

        String str = "jitender";
       int e = getFirstNonRepeatingChar(str);

       if(e == -1)
       System.out.println("All character are repeating in the given string :"+str+" :" + e);
       else
           System.out.println("First Non repeating Char at index "+ e+ " in the string :"+str );
    }

    public  static int getFirstNonRepeatingChar(String str){

        int freq = 0;

        int index = -1;

        char chars[] = str.toCharArray();//jitender
        //Arrays.sort(chars);//after sorting--eeeefggkkorss

        Map<Character, Integer> count = new HashMap<>();
        for(char c : chars)
        {

            freq = count.getOrDefault(c,0);

            count.put(c,(freq+1));

        }
        for(int i = 0; i<chars.length; i++)
        {
             if(count.get(chars[i]) == 1 )
             {
                 System.out.println(chars[i]);
                 index = i;
                 break;
             }

        }
           return index;
    }
}
