package io.ptrojan.findUniqueNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static double findUniq(double arr[]) {
        Map<Double, Integer> tempMap = new HashMap<>();
        Double result = 0.0;
        for (int i = 0; i < arr.length; i++) {
            Integer tempInt = tempMap.get(arr[i]);
            if (tempInt == null) {
                tempMap.put(arr[i], 1);
            } else {
                tempMap.put(arr[i], tempInt + 1);
            }

        }
        for (Map.Entry<Double, Integer> entry : tempMap.entrySet()) {
            if (entry.getValue() != 1) {
                continue;
            }

            result = entry.getKey();


        }
        return result;
    }
}
