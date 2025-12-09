/*Given two arrays of integers, find which elements in the second array are missing from the first array.*/

import java.util.Map;
import java.util.TreeMap;

public class MissingElementInArray {

    public static void main(String[] args) {

        int arr1[] = {7,2,3,5,6,3,1};
        int arr2[] = {7,3,5,3};

        int[] missingElementInArray = findMissingElementInArray(arr1, arr2);

        for(int a : missingElementInArray)
            System.out.println("Missing Element in An Array : "+ a);
    }

    public static int[] findMissingElementInArray(int a[], int b[])
    {

        TreeMap<Integer,Integer> originalArrayMap = new TreeMap<>();
        for(int a1 : a )
        {
            Integer freq = originalArrayMap.getOrDefault(a1, 0);
            freq++;
            originalArrayMap.put(a1, freq);
        }

        for(int b1 : b)
        {

            Integer freq = originalArrayMap.get(b1);
            freq--;
            if(freq == 0)
                originalArrayMap.remove(b1);
            else
            originalArrayMap.put(b1,freq);
        }

        int missingElementList[] = new int[originalArrayMap.size()];
        int i =0;
        for(Map.Entry<Integer,Integer> entry : originalArrayMap.entrySet())
        {
            missingElementList[i++] = entry.getKey();
        }

        return missingElementList;
    }
}
