//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

import java.util.HashMap;
import java.util.Map;

public class TargetHasingSum7
{
    public static void main(String[] args) {

        int target = 9;
        int[] a = {2,7,11,15};
        int[] targetIndices = twoSumHasing(a,target);
    }

    public static int[] twoSumHasing(int[] a , int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int complement = target - a[i];
            if(map.containsKey(complement))
                return new int[]{map.get(complement),i};

            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
}
