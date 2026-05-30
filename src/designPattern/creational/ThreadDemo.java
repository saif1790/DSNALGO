package designPattern.creational;

public class ThreadDemo implements Runnable{


  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
    /*ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
    System.out.println("HashCode :" +threadSafeSingleton.hashCode());*/

    DoubleCheckedSingleton doubleCheckedSingleton = DoubleCheckedSingleton.getInstance();
    System.out.println("HashCode :" +doubleCheckedSingleton.hashCode());
  }
}
