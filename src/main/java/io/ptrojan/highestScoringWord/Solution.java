package io.ptrojan.highestScoringWord;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static String high(String s) {
        Map<String, Integer> alphabetMap = new HashMap<>();
        alphabetMap.put("a", 1);
        alphabetMap.put("b", 2);
        alphabetMap.put("c", 3);
        alphabetMap.put("d", 4);
        alphabetMap.put("e", 5);
        alphabetMap.put("f", 6);
        alphabetMap.put("g", 7);
        alphabetMap.put("h", 8);
        alphabetMap.put("i", 9);
        alphabetMap.put("j", 10);
        alphabetMap.put("k", 11);
        alphabetMap.put("l", 12);
        alphabetMap.put("m", 13);
        alphabetMap.put("n", 14);
        alphabetMap.put("o", 15);
        alphabetMap.put("p", 16);
        alphabetMap.put("q", 17);
        alphabetMap.put("r", 18);
        alphabetMap.put("s", 19);
        alphabetMap.put("t", 20);
        alphabetMap.put("u", 21);
        alphabetMap.put("v", 22);
        alphabetMap.put("w", 23);
        alphabetMap.put("x", 24);
        alphabetMap.put("y", 25);
        alphabetMap.put("z", 26);
        int counter = 0;
        String[] strings = s.split(" ");
        int[] stringsValue = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            for (int j = 0; j < string.length(); j++) {
                Integer c = alphabetMap.get(String.valueOf(string.charAt(j)));
                counter = counter + c;
            }
            stringsValue[i] = counter;
            counter = 0;
        }
        int indexOfHighestNumber = 0;
        int highestNumber = 0;
        for (int k = 0; k < stringsValue.length; k++) {
            if (highestNumber < stringsValue[k]) {
                highestNumber = stringsValue[k];
                indexOfHighestNumber = k;
            }

        }
        return strings[indexOfHighestNumber];
    }


}
