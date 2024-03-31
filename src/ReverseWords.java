public class ReverseWords {

    public static void main(String[] args) {

        String s = "welcome to xyz";
        char[] arr = s.toCharArray();
        int left = 0, right = 0;


        while (right < arr.length) {
            if (arr[right] == ' ') {
                reverseWord(arr, left, right - 1);
                left = right + 1;
            }
            right++;
        }
        reverseWord(arr, left, right - 1);

      String newWordString = new String(arr);
        System.out.println("Original String :"+ s);
        System.out.println("Reverse word of String :"+newWordString);
    }

    private static void reverseWord(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
             left++;
             right--;
        }

    }
}
