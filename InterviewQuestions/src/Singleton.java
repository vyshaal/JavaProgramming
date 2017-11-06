/**
 * Created by vyshaalnarayanam on 11/6/17.
 */
public class Singleton {
  public int data;
  public static Singleton instance = new Singleton(1);

  private Singleton(int x){
    this.data = x;
  }

  public static Singleton getSingleton(){
    return instance;
  }

  public int getData(){
    return this.data;
  }

  public static void main(String[] args){
    Singleton obj = getSingleton();
    System.out.println(obj.data);
  }
}
