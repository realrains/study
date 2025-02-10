package net.realrain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertAllTest {

    @Test
    void testSystemNotVerified() {
        SUT sut = new SUT();

        assertAll("테스트 대상 시스템이 검증되지 않았는지 확인",
                () -> assertEquals("테스트 대상 시스템", sut.getSystemName()),
                () -> assertFalse(sut.isVerified()));
    }

    @Test
    void testSystemVerified() {
        SUT sut = new SUT();
        sut.verify();

        assertAll("테스트 대상 시스템이 검증되었는지 확인",
                () -> assertEquals("테스트 대상 시스템", sut.getSystemName()),
                () -> assertTrue(sut.isVerified())
        );
    }
}
