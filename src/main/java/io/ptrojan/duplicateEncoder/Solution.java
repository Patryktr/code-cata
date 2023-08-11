package io.ptrojan.duplicateEncoder;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String encode(String word) {
        Map<String, Integer> tempMap = new HashMap<>();
        String result = "";
        String wordLowerCase = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            String sign = wordLowerCase.charAt(i) + "";

            if (tempMap.get(sign) == null) {
                tempMap.put(sign, 1);
            } else {
                Integer tempInt = tempMap.get(sign);
                tempInt++;
                tempMap.put(sign, tempInt);
            }

        }
        for (int i = 0; i < word.length(); i++) {
            String sign = wordLowerCase.charAt(i) + "";

            if (tempMap.get(sign) == 1) {
                result = result + "(";

            } else {
                result = result + ")";
            }

        }

        return result;

    }
}
