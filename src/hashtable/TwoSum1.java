package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
  public int[] twoSum(int[] array, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int diff = 0;
    for (int i = 0; i < array.length; i++) {
      diff = target - array[i];
      if(map.containsKey(diff)) {
        return new int[] {i, map.get(diff)};
      }
      map.put(array[i], i);
      System.out.println(map);
    }
    return null;
  }
  public static void main(String[] args) {
    int[] array = {10,2,7,11,15};
    int target = 9;

    TwoSum1 t = new TwoSum1();
    System.out.println(Arrays.toString(t.twoSum(array, target)));
  }
}
