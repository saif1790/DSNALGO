package company_based_problem.infosys;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

  public static void main(String[] args) {

    int[] a = {1, 2, 3, 2, 4, 5, 1};

    Set<Integer> set = new HashSet<>();
    for(Integer a2 :  a)
    {
      if(!set.add(a2))
      {
        System.out.println("Elements :"+a2 +" found duplicate");
      }
    }
  }
}
