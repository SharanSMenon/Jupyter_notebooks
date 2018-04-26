import java.math.BigInteger;
import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        ArrayList<BigInteger> f = new ArrayList<>();
        ArrayList<BigInteger> filtered = new ArrayList<>();
        f.add(BigInteger.ZERO);
        f.add(BigInteger.ONE);
        for (int i = 2; i < (int) to + 1; i++) {
            f.add(f.get(i - 1).add(f.get(i - 2)));
        }
        BigInteger sum = BigInteger.ZERO;
        for (int i = (int) from; i < (int) to + 1; i++) {
            filtered.add(f.get(i));
        }
        for (BigInteger i : filtered) {
            sum = sum.add(i);
        }
        String sumString = sum.toString();
        String lastChar = Character.toString(sumString.charAt(sumString.length() - 1));
        return Long.parseLong(lastChar);
    }

    public static void printArray(ArrayList<BigInteger> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Element " + i + ", Value: " + array.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}
