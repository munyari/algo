package algo.test;

import algo.src.InsertionSort;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest
{
  @Test
  public void testInsertionSort()
  {
    InsertionSort insertionSortObj = new InsertionSort();
    int[] a0 = {696, 991, 494, 912, 442, 153};
    int[] a1 = {367, 651, 82, 15, 777, 319};
    int[] a2 = {2, 23, 91, 74, 27, 959, 283, 201, 652};

    int[] b0 = {153, 442, 494, 696, 912, 991};
    int[] b1 = {15, 82, 319, 367, 651, 777};
    int[] b2 = {2, 23, 27, 74, 91, 201, 283, 652, 959};

    insertionSortObj.insertionSort(a0);
    insertionSortObj.insertionSort(a1);
    insertionSortObj.insertionSort(a2);

    assertArrayEquals(a0, b0);
    assertArrayEquals(a1, b1);
    assertArrayEquals(a2, b2);
  }
}


