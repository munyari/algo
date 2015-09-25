// java.util.* has been imported for this problem.
// You don't need any other imports.

public static double pow(double x, int n) {
    // Add your code below this line. Do not modify any other code.            
    if (n == 0) {
        return 1;
    }
    if (n == 1 || x == 0) {
        return x;
    }
    if (n < 0) {
        return pow(1 / x, -n);
    }
    if (n % 2 == 1) {
        return x * pow(x * x, n / 2);
    }
    return pow(x * x, n / 2);
    // Add your code above this line. Do not modify any other code.
}