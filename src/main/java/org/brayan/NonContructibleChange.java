package org.brayan;

import java.util.Collections;
import java.util.List;

public final class NonContructibleChange {

    private NonContructibleChange() {
        throw new AssertionError("Cannot be instatiated");
    }

    public static Integer getNonContructibleChange(List<Integer> coinsInput) {
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
}
