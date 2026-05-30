public class PrintEctremeElement
{
  public static void main(String[] args) {

    int[] a = {1,2,3,4,5};
    int j=a.length-1;
     int i= 0;
    while(i <= j){
      if(i == j)
      {
        System.out.print(a[i]+" ");
        return;
      }
      System.out.print(a[i]+" ");
       i++;
      System.out.print(a[j]+" ");
      j--;
    }
  }
}
