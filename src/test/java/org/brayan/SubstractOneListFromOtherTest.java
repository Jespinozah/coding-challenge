package org.brayan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SubstractOneListFromOtherTest {

    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3}, SubstractOneListFromOther.arrayDiff(new int[]{1, 2, 3}, new int[]{2}));
        assertArrayEquals(new int[]{2, 2}, SubstractOneListFromOther.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2}, SubstractOneListFromOther.arrayDiff(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, SubstractOneListFromOther.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, SubstractOneListFromOther.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, SubstractOneListFromOther.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, SubstractOneListFromOther.arrayDiff(new int[]{}, new int[]{1, 2}));
        assertArrayEquals(new int[]{}, SubstractOneListFromOther.arrayDiff(new int[]{}, new int[]{1, 2}));
    }

}
