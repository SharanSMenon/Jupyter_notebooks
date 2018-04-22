import java.math.BigInteger;
import java.util.*;

// import sun.nio.cs.ext.Big5;

public class FibonacciSumLastDigit {
    private static BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }

    private static BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        int m = 0;
        for (int bit = Integer.highestOneBit(n); bit != 0; bit >>>= 1) {
            // Double it
            BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
            BigInteger e = multiply(a, a).add(multiply(b, b));
            a = d;
            b = e;
            m *= 2;
            // Advance by one conditionally
            if ((n & bit) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
                m++;
            }
        }
        return a;
    }

    private static long getFibonacciSum(int n) {
        // System.out.println(n);
        if (n == 0 || n == 1) {
            return 0;
        } else {
            BigInteger[] f = new BigInteger[n];
            f[0] = BigInteger.ZERO;
            f[1] = BigInteger.ONE;
            for (int i = 2; i < n; i++) {
                f[i] = fibonacci(i);
            }
            Long sum = 0l;
            for (int i = 0; i < f.length; i++) {
                sum += f[i].longValue();
            }
            String sm = sum.toString();
            System.out.println(sm);
            String lastCharacter = sm.substring(sm.length() - 1);
            // System.out.println(sum);
            Long fn = Long.parseLong(lastCharacter);
            return fn;
        }
    }

    private static void printArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", Value: " + array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter number");
        int n = scanner.nextInt();
        long s = getFibonacciSum(n + 1);
        System.out.println(s);
        // printArray(s);
    }
}
