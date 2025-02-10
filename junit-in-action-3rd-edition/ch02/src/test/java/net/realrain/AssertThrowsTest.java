package net.realrain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowsTest {

    private SUT sut = new SUT();

    @Test
    void testExpectedException() {
        assertThrows(IllegalStateException.class, sut::run);
    }

    @Test
    void testCatchException() {
        Throwable e = assertThrows(IllegalStateException.class, sut::run);
        assertEquals("실행할 작업이 없습니다", e.getMessage());
    }
}
