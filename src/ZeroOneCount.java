import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

public class ZeroOneCount {

  public static void main(String[] args) {

    int[] a = {0,1,1,0,0,0,1,-1};

    int[] count = getCount(a);

      System.out.println("ZeroCount :"+count[0] );
      System.out.println("OnesCount :"+count[1] );

  }
    public static int[] getCount(int[] a){
    int zeroCount = 0;
    int onesCount = 0;
    for(int i=0;i<a.length; i++)
    {
      if(a[i]==0)
        zeroCount++;
      else
        onesCount++;
    }
    int[] ansCount = {zeroCount,onesCount};
    return ansCount;
  }

}
