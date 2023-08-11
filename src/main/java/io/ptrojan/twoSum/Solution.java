package io.ptrojan.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String battle(String goodAmounts, String evilAmounts) {
        String[] good = goodAmounts.split(" ");
        String[] evil = evilAmounts.split(" ");
        Map<Integer, Integer> goodWariorrsMap = new HashMap<>();
        Map<Integer, Integer> evilWariorrsMap = new HashMap<>();
        goodWariorrsMap.put(0, 1);
        goodWariorrsMap.put(1, 2);
        goodWariorrsMap.put(2, 3);
        goodWariorrsMap.put(3, 3);
        goodWariorrsMap.put(4, 4);
        goodWariorrsMap.put(5, 10);
        evilWariorrsMap.put(0, 1);
        evilWariorrsMap.put(1, 2);
        evilWariorrsMap.put(2, 2);
        evilWariorrsMap.put(3, 2);
        evilWariorrsMap.put(4, 3);
        evilWariorrsMap.put(5, 5);
        evilWariorrsMap.put(6, 10);
        int sumGood = 0;
        int sumEvil = 0;

        for (int i = 0; i < good.length; i++) {
            Integer numberOfGoodWarriors = Integer.valueOf(good[i]);
            if (numberOfGoodWarriors > 0) {
                Integer multiplier = goodWariorrsMap.get(i);
                sumGood = sumGood + multiplier * numberOfGoodWarriors;
            }
        }

        for (int i = 0; i < evil.length; i++) {
            Integer numberOfEvilWarriors = Integer.valueOf(evil[i]);
            if (numberOfEvilWarriors > 0) {
                Integer multiplier = evilWariorrsMap.get(i);
                sumEvil = sumEvil + multiplier * numberOfEvilWarriors;
            }
        }

        if (sumGood > sumEvil) {
            return "Battle Result: Good triumphs over Evil";
        } else if (sumGood < sumEvil) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }


    }
}
