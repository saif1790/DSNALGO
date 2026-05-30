package designPattern.creational;

public class DoubleCheckedSingleton {

  private static volatile DoubleCheckedSingleton doubleCheckedSingleton;

  private DoubleCheckedSingleton(){
    System.out.println("DoubleCheckedSingleton : Constructor executed by "+Thread.currentThread().getName());
  }

  public static DoubleCheckedSingleton getInstance(){

    if(doubleCheckedSingleton == null)
    {
      System.out.println("First check :"+Thread.currentThread().getName());
      synchronized (DoubleCheckedSingleton.class){
        if(doubleCheckedSingleton == null)
        {
          System.out.println("Second check :"+Thread.currentThread().getName());
          return doubleCheckedSingleton = new DoubleCheckedSingleton();
        }
      }
    }
    return doubleCheckedSingleton;
  }

}
