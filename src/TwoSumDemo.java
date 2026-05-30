import java.util.HashMap;
import java.util.Map;

public class TwoSumDemo {

  // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {
      int[] nums = {3, 2, 4};
      int target = 6;

      int[] result = twoSum(nums, target);

      if (result.length > 0) {
        System.out.println("Indices: " + result[0] + ", " + result[1]);
      } else {
        System.out.println("No solution found");
      }
    }
    static int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];

        if (map.containsKey(complement)) {
          return new int[] { map.get(complement), i };
        }

        map.put(nums[i], i);
      }
      return new int[] {};
    }
  }
