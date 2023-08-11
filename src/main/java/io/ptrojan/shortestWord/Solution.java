package io.ptrojan.shortestWord;

public class Solution {
    public static int findShort(String s) {
        String[] arrayOfWord = s.split(" ");
        int min = 0;

        for (int i = 0; i < arrayOfWord.length; i++) {
            if (i == 0) {
                min = arrayOfWord[i].length();


            }
            if (min > arrayOfWord[i].length()) {
                min = arrayOfWord[i].length();

            }
        }


        return min;
    }
}
