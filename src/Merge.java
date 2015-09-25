package algo.src;
// java.util.* has been imported for this problem.
// You don't need any other imports.
public class Merge {
  public int[] merge(int[] arrLeft, int[] arrRight){
    // Add your code below this line. Do not modify any other code.
    int[] result = new int[arrLeft.length + arrRight.length];
    int i = 0, j = 0, k = 0;
    while (i < arrLeft.length && j < arrRight.length)
    {
      if (arrLeft[i] <= arrRight[j])
      {
        result[k++] = arrLeft[i++];
      }
      else
      {
        result[k++] = arrRight[j++];
      }
    }
    while (i < arrLeft.length)
    {
      result[k++] = arrLeft[i++];
    }
    while (j < arrRight.length)
    {
      result[k++] = arrRight[j++];
    }
    return result;
    // Add your code above this line. Do not modify any other code.
  }
}
