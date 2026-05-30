public class RightShiftByKPosition {

  public static void main(String[] args) {

    int[] a = {10, 20, 30, 40, 50, 60, 70};
    int k = 7;
    int n = a.length;
    k = k % n;

    reverse(a,0,n-1);//reverse entire array
    System.out.println();
    reverse(a,0,k-1);//reverse first k element
    System.out.println();
    reverse(a,k,n-1);//reverse all remaining element

  }
  public static void reverse(int[] a,int start, int end){
    int temp;
    while (start < end)
    {
      temp = a[end];
      a[end] = a[start];
      a[start] = temp;
      start++;
      end--;
    }
    for(int num : a) {
      System.out.print(num + " ");
    }
  }
}
