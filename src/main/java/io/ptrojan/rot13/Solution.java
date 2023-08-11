package io.ptrojan.rot13;

public class Solution {
    public static String rot13(String message) {
        String result = "";


        for (int i = 0; i < message.length(); i++) {

            int unicode = message.charAt(i);
            if (unicode >= 97 && unicode <= 122) {
                if (unicode >= 110) {
                    int rot13 = unicode - 13;
                    result = result + (char) rot13;


                } else {
                    int rot13 = unicode + 13;
                    result = result + (char) rot13;
                }
            } else if (unicode >= 65 && unicode <= 90) {
                if (unicode >= 78) {
                    int rot13 = unicode - 13;
                    result = result + (char) rot13;
                } else {
                    int rot13 = unicode + 13;
                    result = result + (char) rot13;
                }
            } else {
                result = result + message.charAt(i);
            }

        }

        return result;
    }
}
