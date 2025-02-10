package net.realrain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsTest {

    private static String EXPECTED_JAVA_VERSION = "21";
    private TestsEnvironment environment = new TestsEnvironment(
            new JavaSpecification(System.getProperty("java.vm.specification.version")),
            new OperationSystem(System.getProperty("os.name"), System.getProperty("os.arch"))
    );


    private SUT sut = new SUT();

    @BeforeEach
    void setUp() {
        assumeFalse(environment.isWindows());
    }

    @Test
    void testNoJobsToRun() {
        assumingThat(
                () -> environment.getJavaVersion().equals(EXPECTED_JAVA_VERSION),
                () -> assertFalse(sut.isVerified())
        );
    }

    @Test
    void testJobToRun() {
        assumeTrue(environment.isAmd64Architecture());
        sut.addJob(new Job("Job"));
        sut.run();
    }

}
