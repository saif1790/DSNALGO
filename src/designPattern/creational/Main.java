package designPattern.creational;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

  public static void main(String[] args) {
    /*SingletonDesign object1 = SingletonDesign.getInstance();
    System.out.println(object1.hashCode());

    SingletonDesign object2 = SingletonDesign.getInstance();
    System.out.println(object2.hashCode());*/

    //calling ThreadSafeSingleton class
   /* ThreadDemo threadDemo = new ThreadDemo();
    Thread thread1 = new Thread(threadDemo);
    thread1.setName("Thread-1");
    Thread thread2 = new Thread(threadDemo);
    thread2.setName("Thread-2");
    thread1.start();
    thread2.start();*/

    EnumSingleton object1 = EnumSingleton.INSTANCE;
    System.out.println(object1.hashCode());

    EnumSingleton object2 = EnumSingleton.INSTANCE;
    System.out.println(object2.hashCode());
  }
}
