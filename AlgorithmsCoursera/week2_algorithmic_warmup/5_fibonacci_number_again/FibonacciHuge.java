import java.math.BigInteger;
import java.util.*;

public class FibonacciHuge {
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

    private static long getFibonacciHugeNaive(long n, int m) {
        if (n <= 1)
            return n;
        String j = Long.toString(m);
        BigInteger l = fibonacci((int) n);
        BigInteger k = new BigInteger(j);
        return (l.mod(k)).longValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value: ");
        long n = scanner.nextLong();
        System.out.println("Enter next value: ");
        int m = scanner.nextInt();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}
