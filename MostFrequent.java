import java.util.HashMap;

public class MostFrequent {
  public static void main(String[] args) {
    int[] test = {2, 5, 7, 2, 5, 5, 2, 8};
    System.out.println(solve(test));
  }

  public static int solve(int[] a) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i : a) {
      if (map.containsKey(i)) {
        map.put(i, map.get(i) + 1);
      }
      else {
        map.put(i, 1);
      }
    }
    int max = Integer.MIN_VALUE;
    int max_key = -1;
    for (int k: map.keySet()) {
      int curr_key = map.get(k);
      if (curr_key > max) {
        max_key = k;
        max = curr_key;
      }
    }
    return max_key;
  }
}
