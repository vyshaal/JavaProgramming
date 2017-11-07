/**
 * Created by vyshaalnarayanam on 11/6/17.
 */
public class StringReverseRecursion {

  public static String reverse(String s){
    if(s.length() == 1)
      return s;
    if(s.length() == 2)
      return s.substring(1) + s.substring(0,1);
    int len = s.length();
    s = s.substring(len-1) + reverse(s.substring(1,len-1)) + s.substring(0,1);
    return s;
  }

  public static void main(String[] args){
    String s = "vyshaal";
    System.out.println(reverse(s));
  }
}
