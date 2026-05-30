import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

  private final ReentrantLock lock = new ReentrantLock();
  private final Condition pingTurn = lock.newCondition();
  private final Condition pongTurn = lock.newCondition();

  public boolean isPingTurn = true;

  public void ping()  {

    for(int i=1; i<=5; i++){
      lock.lock();
      try{
        while(!isPingTurn)
          pingTurn.await();
        System.out.println("Ping");
        isPingTurn = false;
        pongTurn.signal();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
       finally {
        lock.unlock();
      }
    }
  }
  public void pong() {

    for(int i=1; i<=5; i++){
      lock.lock();
      try{
      while(isPingTurn)
      {
        pongTurn.await();
      }
      System.out.println("Pong");
          isPingTurn = true;
          pingTurn.signal();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      finally {
          lock.unlock();
        }
    }
  }

  public static void main(String[] args) throws InterruptedException{
    ReentrantLockDemo pingPong = new ReentrantLockDemo();
    Thread t1 = new Thread(pingPong::ping);
    Thread t2 = new Thread(pingPong::pong);

    t1.start();
    t2.start();

  }

}
