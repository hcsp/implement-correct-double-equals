package com.github.hcsp.datatype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void numberEqualsTest() {
        assertEquals(true, Main.doubleEquals(0.1 + 0.2, 0.3));
        assertEquals(false, Main.doubleEquals(0.1, 0.2));
    }
}
