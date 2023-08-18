package org.brayan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoContructibleChangeTest {

    @Test
    public void tests() {
        assertEquals(null, NonContructibleChange.getNonContructibleChange(null));
        assertEquals(null, NonContructibleChange.getNonContructibleChange(Arrays.asList()));
        assertEquals(4, NonContructibleChange.getNonContructibleChange(Arrays.asList(1, 2, 5)));
        assertEquals(20, NonContructibleChange.getNonContructibleChange(Arrays.asList(5, 7, 1, 1, 2, 3, 22)));
        assertEquals(7, NonContructibleChange.getNonContructibleChange(Arrays.asList(1, 1, 1, 1, 1, 1)));
        assertEquals(55, NonContructibleChange.getNonContructibleChange(Arrays.asList(1, 5, 1, 1, 1, 10, 15, 20, 100)));
    }
}
