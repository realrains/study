package net.realrain;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class AssertTimeoutTest {

    private SUT systemUnderTest = new SUT("테스트 대상 시스템");

    @Test
    void testTimeout() {
        systemUnderTest.addJob(new Job("Job 1"));
        assertTimeout(Duration.ofMillis(500), () -> systemUnderTest.run(Duration.ofMillis(200)));
    }

    @Test
    void testTimeoutPreemptively() {
        systemUnderTest.addJob(new Job("Job 1"));
        assertTimeoutPreemptively(Duration.ofMillis(500), () -> systemUnderTest.run(Duration.ofMillis(200)));
    }

}
