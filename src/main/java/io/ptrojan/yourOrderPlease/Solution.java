package io.ptrojan.yourOrderPlease;

public class Solution {
    public static String order(String words) {
        String result = "";
        if (words.isEmpty()) {
            return result;
        } else {
            String[] splitWords = words.split(" ");
            String[] splitWordsResult = new String[splitWords.length];

            for (String word : splitWords) {
                splitWordsResult[indexOfWord(word) - 1] = word;

            }
            for (int j = 0; j < splitWordsResult.length; j++) {
                if (!(j == 0)) {
                    result = result + " ";

                }
                result = result + splitWordsResult[j];

            }
        }
        return result;
    }

    public static int indexOfWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 49 && c <= 57) {
                return c - 48;
            }
        }
        return 0;
    }
}
