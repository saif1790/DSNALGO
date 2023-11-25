import java.util.ArrayList;
import java.util.Arrays;

public class TargetTwoSum6 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] a1 = {16, 4, 23, 8, 15, 42, 1, 2};

        int targetNumber = 25;
        Integer[] copyArray = new Integer[a1.length];
        for (int i = 0; i < a1.length; i++)
            copyArray[i] = a1[i];
        int[] resultIndex = targetTwoSum(copyArray, targetNumber);
        for (int i = 0; i < a1.length; i++) {
            if (resultIndex[0] == a1[i] || resultIndex[1] == a1[i])
                arrayList.add(i);
        }
        if (resultIndex[0] == -1 || resultIndex[1] == -1 )
            System.out.println("No Matching Target is found ");
        else
            System.out.println("Matching Target is found at index :"+arrayList);
    }

    public static int[] targetTwoSum(Integer[] b, int target) {

        Arrays.sort(b);//[1,2,4,8,15,16,23,42]
        int start = 0;
        int end = b.length - 1;
        while (start < end) {
            if (b[start] + b[end] == target) {
                return new int[]{b[start], b[end]};
            } else if (b[start] + b[end] < target) {
                start = start + 1;
            } else {
                end = end - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
