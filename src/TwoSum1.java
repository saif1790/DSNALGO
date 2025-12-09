import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class TwoSum1  {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        int nums[] = {2,7,11,15};
        int resultIndices[] = twoSum(nums,9);
        System.out.println(resultIndices);
    }

        public static int[] twoSum(int[] nums, int target) {

            System.out.println("Number before sorting :"+ nums);
            int left = 0;
            int right = nums.length - 1;
            Arrays.sort(nums);
            System.out.println("Number before sorting :"+ nums);

            while(left < right)
            {
                int sum = nums[left] + nums[right];
                if(sum == target){
                    return new int[]{left, right};
                }
                else if(sum > target)
                {
                    right--;
                }
                else{
                    left++;
                }
            }
            return new int[]{};
        }

}
