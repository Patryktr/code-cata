package io.ptrojan.detectPangram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean check(String sentence) {
        Map<String, Integer> alphabetMap = new HashMap<>();
        alphabetMap.put("a", 0);
        alphabetMap.put("b", 0);
        alphabetMap.put("c", 0);
        alphabetMap.put("d", 0);
        alphabetMap.put("e", 0);
        alphabetMap.put("f", 0);
        alphabetMap.put("g", 0);
        alphabetMap.put("h", 0);
        alphabetMap.put("i", 0);
        alphabetMap.put("j", 0);
        alphabetMap.put("k", 0);
        alphabetMap.put("l", 0);
        alphabetMap.put("m", 0);
        alphabetMap.put("n", 0);
        alphabetMap.put("o", 0);
        alphabetMap.put("p", 0);
        alphabetMap.put("q", 0);
        alphabetMap.put("r", 0);
        alphabetMap.put("s", 0);
        alphabetMap.put("t", 0);
        alphabetMap.put("u", 0);
        alphabetMap.put("v", 0);
        alphabetMap.put("w", 0);
        alphabetMap.put("x", 0);
        alphabetMap.put("y", 0);
        alphabetMap.put("z", 0);
        String lowerCaseSentence = sentence.toLowerCase();
        String[] splitSentence = lowerCaseSentence.split(" ");
        String string = Arrays.toString(splitSentence);
        for (int i = 0; i < string.length(); i++) {

            String key = string.charAt(i) + "";

            Integer integer = alphabetMap.get(key);
            if (integer == null) {
                continue;
            }
            integer = integer + 1;
            alphabetMap.put(key, integer);
        }
        for (Map.Entry<String, Integer> entry : alphabetMap.entrySet()) {
            if (entry.getValue() == 0) {
                return false;
            }

        }
        return true;
    }
}
