public class SmallestEvenNumber
{
    public static void main(String[] args) {

        int[] a = {30,18,56,33,82,40};//30,18,56,82,40
        int smallestEvenNum = getSmallestEvenNumber(a);
        System.out.println("Smallest Even Number is: "+smallestEvenNum);
    }

    public static int getSmallestEvenNumber(int[] a1)
    {
       int len = a1.length;
       int i = 0;
       int min_max = a1[0];
       int max = a1[0];

       while (i < len)
       {
           if(a1[i] % 2 ==0 && min_max > a1[i] )
           {
               min_max = a1[i];

           }
           i++;
       }
        return min_max;
    }
}
