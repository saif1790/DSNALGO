//Given a non-empty array of integers nums, every element appears twice except for one.
// Find that single one.
public class SingleNumber1
{
    public static void main(String[] args) {

      int a[] = {4,1,2,1,2,4,-1};
      int sNumber = singleNumber(a);
      System.out.println("Single Number : "+sNumber);
    }
    public static int singleNumber(int a[])
    {
        int firstIndex = a[0];

        for(int i=1; i<a.length;i++)
        {
            firstIndex = firstIndex ^ a[i];//
        }
        return firstIndex;
    }
}
