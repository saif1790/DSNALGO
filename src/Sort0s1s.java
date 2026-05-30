public class Sort0s1s {

  public static void main(String[] args) {

    int[] a = {0,1,0,1,0,1};
    int i = 0;
    int j = a.length-1;
    int temp;
    while (i < j)
    {
      if(a[i] == 1 && a[j] == 0)
      {
        swap(a,a[i],a[j]);
       /* a[i] = 0;
        a[j] = 1;*/
      }
      if (a[i] == 0) {
        i++;
      }
      if (a[j] == 1) {
        j--;
      }
    }

    System.out.println("After sorting 0s and 1s :");
    for(int i1 : a)
    {
      System.out.print(i1+" ");
    }
  }

  public static void swap(int[] a,int i, int j)
  {
    int temp;
    temp = i;
    a[i] = j;
    a[j] = temp;
  }
}
