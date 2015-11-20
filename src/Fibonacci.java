package algo.src;
import java.util.Arrays;

public class Fibonacci
{
  public long fibRecursive(int n)
  {
    if (n == 0 || n == 1)
      return n;
    return fibRecursive(n - 2) + fibRecursive(n - 1);
  }

  public long fibMemoized(int n)
  {
    long[] fibs = new long[n+1];
    fibs[0] = 0;
    fibs[1] = 1;
    for (int i = 2; i <= n; i++)
    {
      fibs[i] = fibs[i-2] + fibs[i - 1];
    }
    return fibs[n];
  }

  public long fibIterative(int n)
  {
    if (n == 0 || n == 1)
      return n;

    long a = 0;
    long b = 1;
    long ans = 0;
    for (int i = 2; i <= n; i++)
    {
      ans = a + b;
      a = b;
      b = ans;
    }
    return ans;
  }

  public long fibMatrix(int n)
  {
    // one dimensional representation of 2x2 matrix
    long[] fibMatrix = {1L, 1L, 1L, 0L};
    long[] result = matrixPow(fibMatrix, n);
    return result[1];
  }

  private long[] matrixPow(long[] matrix, int n)
  {
    if (n == 0)
      return new long[]{1l, 0L, 1L, 0L};
    if (n == 1)
      return matrix;
    if (n % 2 == 0)
    {
      return matrixPow(matrixMultiply(matrix, matrix), n / 2);
    }
    return matrixMultiply(matrix,
        matrixPow(matrixMultiply(matrix, matrix), n / 2));
  }

  private long[] matrixMultiply(long[] m1, long[] m2)
  {
    long[] result = {
      m1[0] * m2[0] + m1[1] * m2[2],
      m1[0] * m2[1] + m1[1] * m2[3],
      m1[2] * m2[0] + m1[3] * m2[2],
      m1[2] * m2[1] + m1[3] * m2[3]
    };
    return result;
  }
}
