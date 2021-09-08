package Problem25;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;

public class Problem25 {
    static int fib(int digits) {
        ArrayList<BigInteger> sequence = new ArrayList<BigInteger>();
        sequence.add(BigInteger.valueOf(1));
        sequence.add(BigInteger.valueOf(1));
        int i;
        for(i=2; String.valueOf((sequence.get(i-1))).length()<digits;i++) {
            BigInteger index = sequence.get(i-1).add(sequence.get(i-2));
            sequence.add(index);
            System.out.println(String.valueOf((sequence.get(i-1))).length());
            System.out.println(sequence.get(i-1));
        }
        return sequence.size();
    }
    public static void main(String[] args) {
        System.out.println(fib(1000));
    }
}
