package com.github.hcsp.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void numberEqualsTest() {
        Assertions.assertEquals(true, Main.doubleEquals(0.1 + 0.2, 0.3));
        Assertions.assertEquals(false, Main.doubleEquals(0.1, 0.2));
        Assertions.assertEquals(false, Main.doubleEquals(0.2, 0.1));
    }
}
