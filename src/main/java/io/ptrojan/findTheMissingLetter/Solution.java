package io.ptrojan.findTheMissingLetter;

public class Solution {
    public static char findMissingLetter(char[] array) {
        int previousAscii = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                previousAscii = array[i];
                continue;
            }
            if (!(previousAscii == array[i] - 1)) {
                return (char) (previousAscii + 1);
            }
            previousAscii = array[i];
        }
        return ' ';
    }
}
