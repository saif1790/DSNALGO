public class ReverseArray {

  public static void main(String[] args) {

    int[] a = {1,2,3,4,5};
    int i=0;
    int j = a.length - 1;
    int temp=0;

    System.out.println("Before Reverse Array");
    for(int k = 0; k<a.length; k++)
    {
      System.out.print(a[k]);
    }
    while (i <= j)
    {
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }

    System.out.println("After Reverse Array :");
    for( i = 0; i<a.length; i++)
    {
      System.out.print(a[i]);
    }
  }
}
