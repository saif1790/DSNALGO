//Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums

import java.util.ArrayList;
import java.util.List;

public class DisapearingNumber5 {
    public static void main(String[] args) {

        int a[] = {1, 1, 1, 1, 1, 1};//Disappeared Number from the list :[2, 3, 4, 5, 6]
        //calling findDisappearingNumber() and it will return list of integer number that is disappeared
        List<Integer> disappearingNumbers = findDisappearingNumber(a);
        //print list of disappeared number
        System.out.println("Disappeared Number from the list :" + disappearingNumbers);
    }

    public static List<Integer> findDisappearingNumber(int a[]) {
        List<Integer> results = new ArrayList<>();
        int size = a.length;


        for (int i = 0; i < size; i++) {
            //taking the element of an array as a indices and checking that indices is occupied or not
            //if occupied then marked it negative
            int ind = Math.abs(a[i]) - 1;
            if (a[ind] < 0)
                continue;
            a[ind] = a[ind] * -1;
        }

        //iterating an array to check the element > 0  that is not marked negative
        // and that is disappeared number
        for (int i = 0; i < size; i++) {
            if (a[i] > 0)
                results.add(i + 1);
        }
        return results;
    }
}
