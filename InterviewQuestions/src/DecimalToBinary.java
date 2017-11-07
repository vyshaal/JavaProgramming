/**
 * Created by vyshaalnarayanam on 11/6/17.
 */
public class DecimalToBinary {
  public static String binary(int d){
    String binary = "";
    int t;
    while(d>0){
      t = d%2;
      if(t==0){
        binary = "0" + binary;
      }
      else{
        binary = "1" + binary;
      }
      d = d/2;
    }
    return binary;
  }

  public static void main(String[] args){
    int decimal = 1024;
    System.out.println(binary(decimal));
  }
}
