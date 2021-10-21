package parenkov.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("all")
public class SimpleTests {

    // Positive tests
    @Test
    void pos_test1() {
        assertTrue(true);
    }

    @Test
    void pos_test2() {
        assertTrue(true);
    }

    @Test
    void pos_test3() {
        assertTrue(true);
    }

    @Test
    void pos_test4() {
        assertTrue(true);
    }

    @Test
    void pos_test5() {
        assertTrue(true);
    }

    // Negative tests
    @Test
    void neg_test1() {
        assertTrue(false);
    }

    @Test
    void neg_test2() {
        assertTrue(false);
    }

    @Test
    void neg_test3() {
        assertTrue(false);
    }

    // Skipped tests
    @Test
    @Disabled
    void dis_test1() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void dis_test2() {
        assertTrue(true);
    }
}
