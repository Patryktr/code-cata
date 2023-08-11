package io.ptrojan.digPow;

public class Solution {
    public static long digPow(int n, int p) {
        String number = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            String stringDigit = number.charAt(i) + "";
            int digit = Integer.parseInt(stringDigit);
            sum = sum + (int) Math.pow(digit, p + i);
        }
        for (int k = 1; n * k <= sum; k++) {
            if (n * k == sum) {
                return k;
            }
        }

        return -1;
    }
}
