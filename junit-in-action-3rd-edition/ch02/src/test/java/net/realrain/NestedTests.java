package net.realrain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedTests {

    private static final String FIRST_NAME = "Jinwoo";
    private static final String LAST_NAME = "Jang";

    @Nested
    class BuilderTest {
        private String MIDDLE_NAME = "Jay";

        @Test
        void customerNameBuild() {
            String fullName = String.join(" ", FIRST_NAME, MIDDLE_NAME, LAST_NAME);

            assertEquals("Jinwoo Jay Jang", fullName);
        }
    }

}
