package designPattern.creational;

public class ThreadSafeSingleton {

  private static ThreadSafeSingleton threadSafeSingleton;

  private ThreadSafeSingleton(){
    System.out.println("ThreadSafeSingleton --Inside Private Constructor : Access by "+Thread.currentThread().getName());
  }

  public static synchronized ThreadSafeSingleton getInstance()
  {
    if(threadSafeSingleton == null)
    {
      return threadSafeSingleton =new ThreadSafeSingleton();
    }
    return threadSafeSingleton;
  }
}
