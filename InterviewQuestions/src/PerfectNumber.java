/**
 * Created by vyshaalnarayanam on 11/6/17.
 */
public class PerfectNumber {

  public static boolean isPerfect(int n){
    int count = 0;
    for(int i=1;i<n;i++){
      if(n%i == 0)
        count += i;
    }
    return (count==n);
  }

  public static void main(String[] args){
    int i = 27;
    System.out.println(isPerfect(i));
  }
}
