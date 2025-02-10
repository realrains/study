package net.realrain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledMethodTest {

    @Test
    @Disabled("This test is disabled")
    void test() {
        System.out.println("This message must not be shown");
    }
}
