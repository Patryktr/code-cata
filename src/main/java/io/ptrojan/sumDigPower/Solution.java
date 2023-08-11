package io.ptrojan.sumDigPower;

import java.util.ArrayList;
import java.util.List;

public class Solution {  public static List<Long> sumDigPow(long a, long b) {

    List<Long> result = new ArrayList<>();
    for (long i = a; i <= b; i++) {
        int sum = 0;
        String number = String.valueOf(i);
        if (i < 10) {
            result.add(i);
            continue;
        }

        for (int j = 0; j < number.length(); j++) {
            String stringDigit = number.charAt(j) + "";
            int digit = Integer.parseInt(stringDigit);
            sum = sum + (int) Math.pow(digit, 1 + j);
        }
        if (sum == i) {
            result.add(i);

        }

    }
    return result;

}
}
