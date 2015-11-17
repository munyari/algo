package algo.src;

public class InsertionSort 
{

  public void insertionSort(int[] arr)
  {
    for (int i = 1; i < arr.length; i++)
    {
      int j = i;
      while (j > 0 && arr[j-1] > arr[j])
      {
        swap(arr, j, j-1);
        j--;
      }
    }
  }

  public void swap(int[] arr, int i, int j)
  {
    arr[i] ^= arr[j];
    arr[j] ^= arr[i];
    arr[i] ^= arr[j];
  }
}

