package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void deepCopyTest() {
        Home home = new Home(new Cat("Tom"));
        Home deepCopy = deepCopy(home);
        assertFalse(home.cat == deepCopy.cat);
    }
}
