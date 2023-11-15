public class SingleNumber
{
    public static void main(String[] args) {

      int a[] = {4,1,2,1,2};
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
