import java.util.ArrayList;
import java.util.List;

public class FindDuplicateWithoutNoExtraSpace {

/*condition : 1 <= numbs[i] <= n means arrays elements should not greater than array's size
Problem :
* Given an integer array numbs of length n where all the integers of numbs are in the range [1, n]
* and each integer appears at most twice, return an array of all the integers that appears twice.

* You must write an algorithm that runs in O(n) time and uses only constant auxiliary space,
*  excluding the space needed to store the output */

    public static void main(String[] args) {

        int numbs[] = {4,3,7,7,8,2,3,1};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbs.length; i++)
        {
            int index = Math.abs(numbs[i]) - 1;

            if(numbs[index] < 0) {
                list.add(index + 1);
            }
             else {
                /*flip the number at the index to negative*/
                numbs[index] = numbs[index] * -1;
            }
        }
        System.out.println(list);
    }
}
