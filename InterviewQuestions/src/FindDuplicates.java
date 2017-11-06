import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by vyshaalnarayanam on 11/6/17.
 */
public class FindDuplicates {
  public static ArrayList<Integer> findDups(ArrayList<Integer> list){
    HashSet<Integer> set = new HashSet<>();
    set.addAll(list);
    for(Integer i: set){
      list.remove(i);
    }
    return list;
  }

  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<10;i++){
      list.add(i);
    }
    list.add(2,1);
    list.add(2,5);
    System.out.print(findDups(list));
  }
}
