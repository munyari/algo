import java.util.HashSet;

public class CommonElem {
  public static HashSet<Integer> commonElem(int[] a, int[] b) {
    HashSet<Integer> result = new HashSet<Integer>();
    HashSet<Integer> elem = new HashSet<Integer>();
    for (int num : a) {
      elem.add(num);
    }
    for (int num : b) {
      if (elem.contains(num)) {
        result.add(num);
      }
    } 
    return result;
  }
    public static void main(String[] args) {
      int[] a = {3, 5, 6, 3, 2, 7, 9};
      int[] b = {12, 4, 6, 3, 9, 43};
      for (int i : commonElem(a, b)) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
}

