package designPattern.creational;

public class SingletonDesign {

  private static SingletonDesign singletonDesign;

  private SingletonDesign(){
    System.out.println("Inside Private Constructor : Access by "+Thread.currentThread().getName());
  }

  public static SingletonDesign getInstance()
  {
    if(singletonDesign == null)
    {
      return singletonDesign =new SingletonDesign();
    }
    return singletonDesign;
  }
}
