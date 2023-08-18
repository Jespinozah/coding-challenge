package org.brayan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicativePersistenceTest {

    @Test
    public void tests() {
        assertEquals(3, MultiplicativePersistence.persistence(39));
        assertEquals(0, MultiplicativePersistence.persistence(4));
        assertEquals(2, MultiplicativePersistence.persistence(25));
        assertEquals(4, MultiplicativePersistence.persistence(999));
    }
}
