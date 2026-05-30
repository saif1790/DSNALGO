public class SwapAlternateElement {

  public static void main(String[] args) {

    int a[] = {1,2,3,4,5};
    int temp;
    for(int i=0; i<a.length -1;i=i+2)
    {
      temp = a[i+1];
      a[i+1] =a[i];
      a[i] = temp;
    }

    for(int i=0;i<a.length;i++)
    System.out.print(a[i]);
  }
}
