package io.ptrojan.perimeterOfSquaresInARectangle;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(SumFct.perimeter(BigInteger.valueOf(30)));
    }

    public class SumFct {
        public static BigInteger perimeter(BigInteger n) {
            BigInteger multiplier = new BigInteger(String.valueOf(4));
            BigInteger bigInteger = sumOfFib(n);
            return sumOfFib(n).multiply(multiplier);

        }

        public static BigInteger sumOfFib(BigInteger n) {
            BigInteger result = BigInteger.valueOf(0);
            BigInteger previousDigit = BigInteger.valueOf(1);
            BigInteger currentDigit = BigInteger.valueOf(1);
            n = n.add(BigInteger.valueOf(1));


            for (int i = 0; i < Integer.parseInt(String.valueOf(n)); i++) {
                BigInteger sumOfPC = previousDigit.add(currentDigit);
                result = sumOfPC;
                previousDigit = currentDigit;
                currentDigit = sumOfPC;


            }

            return result.add(BigInteger.valueOf(-1));
        }

        static int tempSumOfFib(int inti) {
            int a = 1;
            int b = 1;
            int result = 0;


            for (int i = 0; i < inti; i++) {
                int sumOfaAB = a + b;
                result = sumOfaAB;

                a = b;
                b = sumOfaAB;


            }
            return result - 1;
        }

    }
}
