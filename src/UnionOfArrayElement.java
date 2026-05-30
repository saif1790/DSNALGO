import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrayElement {

  public static void main(String[] args) {

    int a1[] = {1,2,3,1,3,2};
    int a2[] = {1,4,5,2,3,3,3,2,8,6,9};

    Set<Integer>  set1 = new HashSet<>();
    Set<Integer>  resultSet = new HashSet<>();

    for(int i : a1)
    {
      set1.add(i);
    }
    for(int j : a2)
    {
      if(set1.contains(j))
      {
        continue;
      }
      else {
        set1.add(j);
      }
    }
    System.out.println("Union of Array Elements :"+set1);
  }
}
