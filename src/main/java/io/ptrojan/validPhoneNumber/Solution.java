package io.ptrojan.validPhoneNumber;

import java.util.List;

public class Solution {
   

    public static boolean validPhoneNumber(String phoneNumber) {
        List<Integer> digit = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (int i = 0; i < phoneNumber.length(); i++) {
            String partOfNumber = String.valueOf(phoneNumber.charAt(i));
            if (i == 0 || i == 4) {
                if (!(partOfNumber.equals(")") || partOfNumber.equals("("))) {
                    return false;
                }
            }
            if ((i > 0 && i < 4) || (i > 5 && i < 9) || (i > 9 && i < 15)) {
                if (!digit.contains(Integer.valueOf(partOfNumber))) {
                    return false;
                }
            }
            if (i == 5) {
                if (!partOfNumber.equals(" ")) {
                    return false;
                }

            }
            if (i == 9) {
                if (!partOfNumber.equals("-")) {
                    return false;
                }
            }

        }

        return true;
    }

}
