package algo.test;

import algo.src.Merge;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MergeTest {
  @Test
  public void testMerge() {
    Merge mergeObj = new Merge();
    int[] a = {1, 2};
    int[] b = {3, 4};
    int[] expected = {1, 2, 3, 4};
    assertArrayEquals(expected, mergeObj.merge(a, b));
  }
}


