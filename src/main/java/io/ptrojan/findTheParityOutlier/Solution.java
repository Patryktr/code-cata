package io.ptrojan.findTheParityOutlier;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int find(int[] integers) {
        Map<String, Integer> specialNumberMap = new HashMap<>();
        specialNumberMap.put("odd", 0);
        specialNumberMap.put("even", 0);
        int previousOdd = 0;
        int previousEven = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                Integer numberOfEven = specialNumberMap.get("even");
                numberOfEven++;
                specialNumberMap.put("even", numberOfEven);
                previousEven = integers[i];

            } else {
                Integer numberOfOdd = specialNumberMap.get("odd");
                numberOfOdd++;
                specialNumberMap.put("odd", numberOfOdd);
                previousOdd = integers[i];
            }
        }
        if (specialNumberMap.get("even") > 1 && specialNumberMap.get("odd") == 1) {
            return previousOdd;
        }
        if (specialNumberMap.get("even") == 1 && specialNumberMap.get("odd") > 1) {
            return previousEven;
        }
        return 0;
    }
}
