package io.ptrojan.multiplesOf3Or5;

public class Solution {
    public static int solution(int number) {
        if (number < 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result = result + i;

            }
        }
        return result;
    }
}
