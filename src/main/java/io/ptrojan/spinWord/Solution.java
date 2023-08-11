package io.ptrojan.spinWord;

public class Solution {
    public static String spinWords(String sentence) {

        StringBuilder result = new StringBuilder();

        String[] words = sentence.split(" ");

        if (words.length == 1) {
            if (words[0].length() < 5) {
                return words[0];
            }
            return reverse(words[0]);
        } else {

            for (int i = 0; i < words.length; i++) {
                if (i > 0) {
                    result.append(" ");
                }
                if (words[i].length() < 5) {
                    result.append(words[i]);
                } else {
                    result.append(reverse(words[i]));
                }

            }
        }
        String.join(" ", words);

        return result.toString();
    }

    public static String reverse(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            String tempLetter = string.charAt(i) + "";
            result = tempLetter + result;

        }

        return result;
    }
}
