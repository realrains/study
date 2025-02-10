package net.realrain;

import org.junit.jupiter.api.*;

public class SutTest {

    @BeforeAll
    static void setUpClass() {
        System.out.println("Set up for all tests");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("Tear down for all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Set up for each test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tear down for each test");
    }

    @Test
    void firstTest() {
        System.out.println("This is first Test");
    }

    @Test
    void secondTest() {
        System.out.println("This is second Test");
    }

}
