package io.ptrojan.countingDuplicates;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int duplicateCount(String text) {
        String lowerCaseText = text.toLowerCase();
        int counterOfDuplicate = 0;
        Map<String, Integer> counterLetter = new HashMap<>();
        for (int i = 0; i < lowerCaseText.length(); i++) {
            String letter = String.valueOf(lowerCaseText.charAt(i));
            if (counterLetter.get(letter) == null) {
                counterLetter.put(letter, 1);
            } else {
                Integer countOfLetter = counterLetter.get(letter);
                counterLetter.put(letter, countOfLetter + 1);
            }
        }
        for (Map.Entry<String, Integer> digit : counterLetter.entrySet()) {
            if (digit.getValue() > 1) {
                counterOfDuplicate++;
            }
        }
        return counterOfDuplicate;
    }
}
