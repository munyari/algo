import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMerge {
  @Test
  public void test() {
    assertEquals((new int[]{1, 2, 3, 4}), new Merge().merge((new int[]{1,2}),
          new int[]{3,4}));
  }
}

