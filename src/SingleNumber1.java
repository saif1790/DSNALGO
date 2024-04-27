import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Given a non-empty array of integers nums, every element appears twice except for one.
// Find that single one.
public class SingleNumber1
{
    public static void main(String[] args) {

       int a[] = {4,1,2,1,2,4,-1,-1,6};
       int sNumber = singleNumber(a);
      if(sNumber == 0)
      System.out.println("No Single Number Available in list : "+sNumber);
      else
          System.out.println("Single Number Available in list : "+sNumber);
    }

    /*Using Bitwise Operator*/
    public static  int singleNumber( int a[])
    {
        int firstIndex = a[0];

        for(int i=1; i<a.length;i++)
        {
            firstIndex = firstIndex ^ a[i];//
            System.out.println(firstIndex);
        }
        return firstIndex;
    }


    /*using HashMap*/
    //Time Complexity : O(n)
    //Space Complexity : O(n)--becasue taking extra space to store object in map
    /*public static int singleNumber(int a[]){

        int size = a.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<size; i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],1);
            }
            else {
                Integer assignedValue = map.get(a[i]);
                map.put(a[i],++assignedValue);
            }
        }

        for(int i=0; i<size; i++)
        {
            if(map.get(a[i]) == 1)
                return a[i];
        }
        return 0;
    }*/

}
