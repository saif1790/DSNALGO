import java.util.ArrayList;

public class UnionOfTwoArrays {

    public static void main(String[] args) {

        int a[] = {1,2,3,1,3,2};
        int b[] = {1,4,5,2,3,3,3,2,8,6,9};

        /*Find the Union that is distinct number from both array*/

       ArrayList<Integer> unionResults = findUnionNumber(a,b);
        System.out.print("Union Of two array :");
       for(int num : unionResults)
           System.out.print(num);
    }
    public static ArrayList<Integer> findUnionNumber(int a[], int b[])
    {
        ArrayList<Integer> unionNumber = new ArrayList<>();

        for(int num : a)
        {
            if(!unionNumber.contains(num))
                unionNumber.add(num);
        }
        for(int num : b)
        {
            if(!unionNumber.contains(num))
                unionNumber.add(num);
        }
        return unionNumber;
    }
}
