package io.ptrojan.splitStrings;

public class Solution {
    public static String[] solution(String s) {

        String pair = "";
        int resultInt = 0;
        if (s.length() % 2 != 0) {
            s = s + "_";

        }
        String[] result = new String[s.length() / 2];
        for (int i = 0; i < s.length(); i++) {
            String currentLetter = s.charAt(i) + "";
            pair = pair + currentLetter;
            if (pair.length() == 2) {
                result[resultInt] = pair;
                resultInt++;

                pair = "";

            }
        }
        return result;
    }
}
