package org.brayan;

import java.util.Collections;
import java.util.List;

public final class CodingChallenge {

    private CodingChallenge() {
        throw new AssertionError("Cannot be instatiated");
    }

    public static Integer nonConstructibleChange(List<Integer> coinsInput) {
        if (coinsInput == null || coinsInput.isEmpty()) {
            return null;
        }
        int value = 0;
        Collections.sort(coinsInput);
        for (Integer coin : coinsInput) {
            if (coin > value + 1) {
                return value + 1;
            }
            value += coin;
        }
        return value + 1;
    }

    public static Integer smallestDifference(List<Integer> firstList, List<Integer> secondList) {
        if (firstList == null || secondList == null || firstList.isEmpty() || secondList.isEmpty()) {
            return null;
        }
        Collections.sort(firstList);
        Collections.sort(secondList);
        int result = Integer.MAX_VALUE;
        int firstListLength = firstList.size(), secondListLength = secondList.size();
        int i = 0, j = 0, difference = 0;

        while (i < firstListLength && j < secondListLength) {
            difference = Math.abs(firstList.get(i) - secondList.get(j));
            if (difference < result) {
                result = difference;
            }
            if (firstList.get(i) < secondList.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
