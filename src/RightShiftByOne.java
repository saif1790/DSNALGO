public class RightShiftByOne {

  public static void main(String[] args) {

    int[] a = {10,20,30,40,50,60,70};

    int temp = a[a.length-1];

    System.out.println("Before one position right shift");
    for(int a1 : a)
      System.out.print(a1+" ");

    for(int i=a.length-1; i>0; i--)
    {
      a[i] = a[i-1];
    }
    a[0] = temp;
    System.out.println("\nAfter one position right shift");
    for(int a1 : a)
      System.out.print(a1+" ");
  }
}
