/**
 * Created by vyshaalnarayanam on 11/6/17.
 */

import java.util.*;
import java.util.stream.Collectors;

public class MidIndexSumEqual {
  public static int findMidIndex(List<Integer> list){
    HashMap<Integer,Integer> indexSumcount = new HashMap<>();
    int count = 0;
    int index = 0;
    for(Integer i: list){
      count += i;
      indexSumcount.put(index,count);
      index += 1;
    }
    for(HashMap.Entry<Integer,Integer> entry: indexSumcount.entrySet()){
      if(entry.getValue()*2 == count){
        return entry.getKey();
      }
    }
    return -1;
  }

  public static void main(String[] args){
    int[] givenList = {1,2,3,5,6,5};
    List<Integer> list = Arrays.stream(givenList).boxed().collect(Collectors.toList());
    System.out.println(list);
    System.out.println(findMidIndex(list));
  }
}
