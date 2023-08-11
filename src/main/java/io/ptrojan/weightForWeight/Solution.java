package io.ptrojan.weightForWeight;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static int stringAsSumDigit(String value) {
        int result = 0;
        for (int j = 0; j < value.length(); j++) {
            int weightInt = Integer.parseInt(String.valueOf(value.charAt(j)));
            result = result + weightInt;
        }
        return result;
    }


    public static String orderWeight(String strng) {
        return  Arrays.stream(strng.split(" ")).sorted((o1, o2) -> {
            int o1AsInt = stringAsSumDigit(o1);
            int o2AsInt = stringAsSumDigit(o2);
            if (o1AsInt > o2AsInt) {
                return 1;
            } else if (o1AsInt < o2AsInt) {
                return -1;
            }
            return o1.compareTo(o2);
        }).collect(Collectors.joining(" "));
    }
}
