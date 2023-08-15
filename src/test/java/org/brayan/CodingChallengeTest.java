package org.brayan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodingChallengeTest {

    @Test
    public void noConstructibleChangeTest() {
        assertEquals(null, CodingChallenge.nonConstructibleChange(null));
        assertEquals(null, CodingChallenge.nonConstructibleChange(Arrays.asList()));
        assertEquals(4, CodingChallenge.nonConstructibleChange(Arrays.asList(1, 2, 5)));
        assertEquals(20, CodingChallenge.nonConstructibleChange(Arrays.asList(5, 7, 1, 1, 2, 3, 22)));
        assertEquals(7, CodingChallenge.nonConstructibleChange(Arrays.asList(1,1,1,1,1,1)));
        assertEquals(55, CodingChallenge.nonConstructibleChange(Arrays.asList(1, 5, 1, 1, 1, 10, 15, 20, 100)));
    }

    @Test
    public void smallestDifference(){
        assertEquals(null, CodingChallenge.smallestDifference(null, null));
        assertEquals(null, CodingChallenge.smallestDifference(Arrays.asList(), Arrays.asList()));
        assertEquals(3, CodingChallenge.smallestDifference(Arrays.asList(1, 3, 15, 11, 2), Arrays.asList(23, 127, 235, 19, 8)));
        assertEquals(10, CodingChallenge.smallestDifference(Arrays.asList(50, 90, 80), Arrays.asList(10, 5, 40)));
    }



}
