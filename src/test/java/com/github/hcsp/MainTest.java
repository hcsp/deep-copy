package com.github.hcsp;

import com.github.hcsp.pet.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void deepCopyTest() {
        Home home = new Home(new Cat("Tom"));
        Home deepCopy = Main.deepCopy(home);
        Assertions.assertFalse(home.cat == deepCopy.cat);
    }
}
