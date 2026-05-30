public class FirstUnsortedElement {

  public static void main(String[] args) {

    int[] a ={1,3,5,6,8,9,7};
    int i;
    for(i=0; i<a.length -1; i++)
    {
      if(a[i+1] < a[i])
      {
        System.out.println("first Unsorted element :"+a[i+1]);
        break;
      }
    }
  }
}
