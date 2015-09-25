package algo.src;

public class Merge {

  public int[] merge(int[] arrLeft, int[] arrRight){

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

  }
}
