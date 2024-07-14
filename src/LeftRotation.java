public class LeftRotation {

    public static void main(String[] args) {

        int K_ROTATION = 7;

        int[] a = {1,2,3,4,5,6,7};

        System.out.print("Before rotation :");
        for(int i : a)
        {
            System.out.print(i+"\t");
        }

        int[] leftRotatedResults = leftRotation(a,K_ROTATION);



        System.out.print("\n After rotation :");
        for(int i : leftRotatedResults)
        {
            System.out.print(i+"\t");
        }
    }
    public static int[]   leftRotation(int[] a,int k){

        if(k > a.length)
        {
            System.out.println("K value should not be greater than arrays length");
            System.exit(0);
        }

        /*Reverse all number*/
         reverseNumber(a,0,a.length-1);

       /*reverse first a.length-k numbers*/
        reverseNumber(a, 0, a.length - k - 1);

        /*reverse Kth number */
        reverseNumber(a,a.length - k,a.length-1);

        return a;
    }

    public static int[] reverseNumber(int[] a,int start,int end)
    {
        while (start < end)
        {
            int temp;
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }

}
