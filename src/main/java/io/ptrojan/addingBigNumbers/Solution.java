package io.ptrojan.addingBigNumbers;

public class Solution {
    public static String add(String a, String b) {
        int len = Math.max(a.length(), b.length());
        int digitToAdd = 0;
        String result = "";
        for (int i = 0; i < len; i++) {
            int nextDigitIndexA = a.length() - 1 - i;
            int nextDigitIndexB = b.length() - 1 - i;
            int aDigit = getNextDigit(a, nextDigitIndexA);
            int bDigit = getNextDigit(b, nextDigitIndexB);

            int sum = aDigit + bDigit + digitToAdd;

            if (sum > 9) {
                String stringSum = String.valueOf(sum);
                digitToAdd = Integer.parseInt(String.valueOf(stringSum.charAt(0)));
                result = Integer.parseInt(String.valueOf(stringSum.charAt(1))) + result;

            } else {
                result = sum + result;
                digitToAdd = 0;
            }
        }
        if (digitToAdd > 0) {
            result = digitToAdd + result;
        }
        result = trimLeadingZeros(result);

        return result;
    }

    private static String trimLeadingZeros(String result) {
        int zeroesQty = 0;
        boolean isOtherThanZero = true;
        int index = 0;
        while (isOtherThanZero) {
            isOtherThanZero = String.valueOf(result.charAt(index)).equals("0");
            if (isOtherThanZero) {
                zeroesQty++;
            }
            index++;
        }
        result = result.substring(zeroesQty);
        return result;
    }

    public static int getNextDigit(String value, int digitIndex) {
        if (digitIndex < 0) {
            return 0;
        }
        return Integer.parseInt(String.valueOf(value.charAt(digitIndex)));
    }
}
