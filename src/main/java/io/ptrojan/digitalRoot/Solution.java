package io.ptrojan.digitalRoot;

public class Solution {
    public static int digital_root(int n) {
        String nString = String.valueOf(n);
        int result = 0;
        while (nString.length() > 1) {

            int part = BreakerIntoParts(nString);
            nString = String.valueOf(part);
            result = part;
        }
        return result;

    }

    public static int BreakerIntoParts(String nString) {
        int result = 0;
        for (int i = 0; i < nString.length(); i++) {
            result = result + Integer.parseInt(String.valueOf(nString.charAt(i)));
        }
        return result;
    }
}
