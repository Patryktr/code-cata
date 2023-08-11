package io.ptrojan.scramblies;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean scramble(String str1, String str2) {
        Map<String, Integer> letterMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {

            String letter = String.valueOf(str1.charAt(i));
            if (letterMap.get(letter) == null) {
                letterMap.put(letter, 1);
            } else {
                Integer qty = letterMap.get(letter);
                qty++;
                letterMap.put(letter, qty);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            String letter = String.valueOf(str2.charAt(i));
            if (letterMap.get(letter) == null) {
                return false;
            } else {
                Integer qty = letterMap.get(letter);
                qty = qty - 1;
                letterMap.put(letter, qty);
                if (qty < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

