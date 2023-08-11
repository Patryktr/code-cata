package io.ptrojan.findOdd;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int findIt(int[] a) {
        int odd = 0;
        Map<String, Integer> tempMap = new HashMap<>();

        if (a.length == 1) {
            odd = a[0];

        } else {
            for (int i = 0; i < a.length; i++) {
                String tempString = a[i] + "";
                Integer tempInt = tempMap.get(tempString);

                if (tempMap.get(tempString) == null) {
                    tempMap.put(tempString, 1);

                } else {
                    tempMap.put(tempString, (tempInt + 1));
                }
            }

        }
        for (Map.Entry<String, Integer> entry : tempMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odd = Integer.valueOf(entry.getKey());
            }

        }


        return odd;
    }
}
