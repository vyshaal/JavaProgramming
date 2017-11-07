/**
 * Created by vyshaalnarayanam on 11/6/17.
 */
public class ReverseNumber {

  public static int reverse(int n){
    int ans = 0;
    int d;
    while(n>0){
      ans = ans*10;
      d = n%10;
      ans += d;
      n = n/10;
    }
    return ans;
  }

  public static void main(String[] args){
    int number = 131245;
    System.out.println(reverse(number));
  }
}
