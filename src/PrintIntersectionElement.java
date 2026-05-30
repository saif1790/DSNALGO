import java.util.HashSet;
import java.util.Set;

public class PrintIntersectionElement {

  public static void main(String[] args) {

    int a1[] = {1,2,3,4,5,6,6};
    int a2[] = {2,5,6,7,8,9,9};
    /*int resultArray[] = new int[a1.length];
    int k =0;

    //O(n^2)
    for(int i=0;i<a1.length;i++){
      for(int j=0;j<a2.length;j++){
        if(a1[i] == a2[j])
        {
          resultArray[k++] = a1[i];
          break;
        }
      }
    }
    for(int i=0; i<k;i++){
      System.out.print(resultArray[i]);
    }

*/
    Set<Integer> set = new HashSet<>();
    Set<Integer> result = new HashSet<>();
    for(int a : a1)
    {
      set.add(a);
    }
    for(int a : a2)
    {
      if(set.contains(a)){
        result.add(a);
      }
    }
    System.out.print("Matching records "+result);
  }
}

/*If array contain duplicate element*/
/*public class PrintIntersectionElement {
  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5, 6, 6};
    int[] a2 = {2, 5, 6, 7, 8, 9, 9};
    int[] resultArray = new int[a1.length];
    int k = 0;
    for (int i = 0; i < a1.length; i++) {
     // check if already added
      boolean alreadyExists = false;
      for (int x = 0; x < k; x++) {
        if (resultArray[x] == a1[i]) {
          alreadyExists = true;
          break;
        }
      }
      if (alreadyExists) continue;
      for (int j = 0; j < a2.length; j++) {
        if (a1[i] == a2[j]) {
          resultArray[k++] = a1[i];
          break;
        }
      }
    } for (int i = 0; i < k; i++) {
      System.out.print(resultArray[i] + "");
    }
  }
}*/
