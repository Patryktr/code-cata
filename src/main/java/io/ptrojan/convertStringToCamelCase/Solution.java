package io.ptrojan.convertStringToCamelCase;

public class Solution {
    public static String toCamelCase(String s) {
        String resutl = "";
        boolean nextToUpper = false;
        for (int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            boolean isDash = letter.equals("-") || letter.equals("_");
            if (isDash) {
                nextToUpper = true;
            }
            if (nextToUpper) {
                if (isDash) {
                    continue;
                } else {
                    String upperCaseLetter = letter.toUpperCase();
                    resutl = resutl + upperCaseLetter;
                    nextToUpper = false;
                    continue;
                }
            }
            resutl = resutl + letter;
        }

        return resutl;
    }

}
