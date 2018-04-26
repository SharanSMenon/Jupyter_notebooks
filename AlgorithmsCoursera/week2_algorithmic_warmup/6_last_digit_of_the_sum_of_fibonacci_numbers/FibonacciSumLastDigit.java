import java.math.BigInteger;
import java.util.*;

// import sun.nio.cs.ext.Big5;

public class FibonacciSumLastDigit {
    private static long getFibonacciSum(int n) {
        ArrayList<BigInteger> f = new ArrayList<>();
        f.add(BigInteger.ZERO);
        f.add(BigInteger.ONE);
        for (int i = 2; i < (int) n; i++) {
            f.add(f.get(i - 1).add(f.get(i - 2)));
        }
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger i : f) {
            sum = sum.add(i);
        }
        String sumString = sum.toString();
        String lastChar = Character.toString(sumString.charAt(sumString.length() - 1));
        return Long.parseLong(lastChar);
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
