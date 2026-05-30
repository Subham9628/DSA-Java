import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialOfLargeNumber {

    public static ArrayList<Integer> factorial(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        String s = fact.toString();
        for (char ch : s.toCharArray()) {
            list.add(ch - 48);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(factorial(80));
    }
}
