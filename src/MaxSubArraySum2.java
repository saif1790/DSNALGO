//Kadanes Algorithm
//Given an integer array nums, find the
//subarray
// with the largest sum, and return its sum.

public class MaxSubArraySum2 {
    public static void main(String[] args) {

        int[] a = {-2, -5, 6, -2, -3, 1, 5, -6};

        int max_sum = maxSubArraySum(a);

        System.out.println("max_sum :" + max_sum);

    }

    public static int maxSubArraySum(int[] a) {

        //To find the possible maximum sum
        int max_sum = a[0];//-2

        //To store the maximum found at a position
        int cur_max = a[0];//-2

        for(int i =1;i<a.length; i++)
        {

            cur_max = Math.max(a[i],(cur_max + a[i]));

            max_sum = Math.max(cur_max,max_sum);
        }


        return max_sum;
    }
}
