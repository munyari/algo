package algo.test;

import algo.src.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest
{
  @Test
  public void testFibRecursive()
  {
    Fibonacci fib = new Fibonacci();
    assertEquals(377L , fib.fibRecursive(14));
    assertEquals(21L , fib.fibRecursive(8));
    assertEquals(13L , fib.fibRecursive(7));
    assertEquals(987L , fib.fibRecursive(16));
    assertEquals(3L , fib.fibRecursive(4));
    assertEquals(55L , fib.fibRecursive(10));
    assertEquals(4181L , fib.fibRecursive(19));
    assertEquals(21L , fib.fibRecursive(8));
    assertEquals(0L , fib.fibRecursive(0));
    assertEquals(1L , fib.fibRecursive(1));
  }

  @Test
  public void testFibMemoized()
  {
    Fibonacci fib = new Fibonacci();
    assertEquals(24157817L , fib.fibMemoized(37));
    assertEquals(591286729879L , fib.fibMemoized(58));
    assertEquals(23416728348467685L , fib.fibMemoized(80));
    assertEquals(144L , fib.fibMemoized(12));
    assertEquals(2L , fib.fibMemoized(3));
    assertEquals(44945570212853L , fib.fibMemoized(67));
    assertEquals(1548008755920L , fib.fibMemoized(60));
    assertEquals(144L , fib.fibMemoized(12));
    assertEquals(17167680177565L , fib.fibMemoized(65));
    assertEquals(4660046610375530309L , fib.fibMemoized(91));
  }

  @Test
  public void testFibIterative()
  {
    Fibonacci fib = new Fibonacci();
    assertEquals(514229L , fib.fibIterative(29));
    assertEquals(317811L , fib.fibIterative(28));
    assertEquals(4052739537881L , fib.fibIterative(62));
    assertEquals(7778742049L , fib.fibIterative(49));
    assertEquals(365435296162L , fib.fibIterative(57));
    assertEquals(6765L , fib.fibIterative(20));
    assertEquals(2971215073L , fib.fibIterative(47));
    assertEquals(1779979416004714189L , fib.fibIterative(89));
    assertEquals(53316291173L , fib.fibIterative(53));
    assertEquals(27777890035288L , fib.fibIterative(66));
  }

  @Test
  public void testFibMatrix()
  {
    Fibonacci fib = new Fibonacci();
    assertEquals(14472334024676221L , fib.fibMatrix(79));
    assertEquals(190392490709135L , fib.fibMatrix(70));
    assertEquals(39088169L , fib.fibMatrix(38));
    assertEquals(8944394323791464L , fib.fibMatrix(78));
    assertEquals(14930352L , fib.fibMatrix(36));
    assertEquals(5527939700884757L , fib.fibMatrix(77));
    assertEquals(3416454622906707L , fib.fibMatrix(76));
    assertEquals(679891637638612258L , fib.fibMatrix(87));
    assertEquals(3L , fib.fibMatrix(4));
    assertEquals(233L , fib.fibMatrix(13));
  }
}
