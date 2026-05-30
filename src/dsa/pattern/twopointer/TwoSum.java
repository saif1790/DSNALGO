package dsa.pattern.twopointer;

import java.util.Arrays;

public class TwoSum {

  public static void main(String[] args) {

    int nums[] = {3,2,4};
    boolean isSumIndicesRequired = true;
    Arrays.sort(nums);//{2,3,4}
    int target = 6;
    int[] indices = sumTwoNumber(nums, target,isSumIndicesRequired);
    System.out.println("Indices to get the sum of 2 number to match target :" + Arrays.toString(indices));
  }

  static int[] sumTwoNumber(int[] nums, int target,boolean number) {

    int left = 0;
    int right = nums.length-1;


    while (left < right)
    {
      if((nums[left] + nums[right])== target)
        if(number)
          return new int[]{left, right};
        else
         return new int[]{nums[left], nums[right]};
      else if ((nums[left] + nums[right]) > target) {
        right--;
      }
      else {
        left++;
      }
    }
    return new int[]{};
  }
}
