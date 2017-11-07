/**
 * Created by vyshaalnarayanam on 11/6/17.
 */
public class DeadLock {
  public static void main(String[] args){
    String object1 = "vyshaal";
    String object2 = "narayanam";

    Thread thread1 = new Thread(){
      public void run(){
        synchronized (object1){
          System.out.println("Thread1: object1");
          try { Thread.sleep(100);} catch (Exception e) {}
          synchronized (object2){
            System.out.println("Thread1: object2");
          }
        }
      }
    };

    Thread thread2 = new Thread(){
      public void run(){
        synchronized (object2){
          System.out.println("Thread2: object2");
          try { Thread.sleep(100);} catch (Exception e) {}
          synchronized (object1){
            System.out.println("Thread2: object1");
          }
        }
      }
    };

    thread1.start();
    thread2.start();
  }
}
