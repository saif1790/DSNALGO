package dsa.pattern.twopointer;

import java.util.Arrays;

public class MoveZero {

  public static void main(String[] args) {

    //int nums[] = {0,1,0,3,0,12,6,7,0,0,0};
    int nums[] = {0};

    int numberAfterMovingZero[] = movesZero(nums);
    System.out.println("Number after moving all Zeros to end :"+ Arrays.toString(numberAfterMovingZero));
  }

  public static int[] movesZero(int[] nums) {

    int j = 0;
    int temp = 0;
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] != 0)
      {
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++;
      }
    }
    return nums;
  }
}
