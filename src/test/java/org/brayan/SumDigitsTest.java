package org.brayan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitsTest {

    @Test
    public void tests() {
        assertEquals(7, SumDigits.digitalRoot(16), "Nope");
        assertEquals(6, SumDigits.digitalRootV2(456), "Nope");
    }
}
