package org.brayan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestDifferenceTest {

    @Test
    public void tests(){
        assertEquals(null, SmallestDifference.getSmallestDifference(null, null));
        assertEquals(null, SmallestDifference.getSmallestDifference(Arrays.asList(), Arrays.asList()));
        assertEquals(3, SmallestDifference.getSmallestDifference(Arrays.asList(1, 3, 15, 11, 2), Arrays.asList(23, 127, 235, 19, 8)));
        assertEquals(10, SmallestDifference.getSmallestDifference(Arrays.asList(50, 90, 80), Arrays.asList(10, 5, 40)));
    }
}
