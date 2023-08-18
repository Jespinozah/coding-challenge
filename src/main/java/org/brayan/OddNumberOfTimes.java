package org.brayan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class OddNumberOfTimes {
    public OddNumberOfTimes() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static int findOdd(int[] a) {
        Arrays.sort(a);
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : a) {
            map.compute(value, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry m : map.entrySet()) {
            if (((int) m.getValue() % 2) != 0) {
                return (int) m.getKey();
            }
        }
        return 0;
    }
}
