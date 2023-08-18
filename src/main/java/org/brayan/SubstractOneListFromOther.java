package org.brayan;

import java.util.Arrays;

public final class SubstractOneListFromOther {
    public SubstractOneListFromOther() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        if (b.length == 0) {
            return a;
        }

        int[] result = Arrays.stream(a).filter(p -> !Arrays.stream(b).anyMatch(d-> d == p)).toArray();
        return result;
    }
}
