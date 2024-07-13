public class MergeStringAlternatively {

    public static void main(String[] args) {

        String s1 = "s";
        String s2 = "aif";

       String result = mergeStringAlternate(s1,s2);
        System.out.println("Merged String :" + result);
    }

    public static String mergeStringAlternate(String s1, String s2){

        StringBuilder mergedString = new StringBuilder();
        int i =0;
        while(i < s1.length() || i < s2.length())
        {
            if(i < s1.length())
            {
                mergedString.append(s1.charAt(i));
            }
            if(i < s2.length())
            {
                mergedString.append(s2.charAt(i));
            }
            i++;
        }
        return mergedString.toString();

    }


}
