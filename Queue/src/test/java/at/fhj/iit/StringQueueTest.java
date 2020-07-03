package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class StringQueueTest {
    StringQueue queue;

    @BeforeEach
    void setup() {
        queue = new StringQueue(5);
    }

    @Test
    @DisplayName("Testing offer StringQueue")
    public void testOfferStringQueue() {
        assertEquals(queue.offer("Test"), true);
        assertEquals(queue.offer("Test2"), true);
        assertEquals(queue.offer("Test3"), true);
        assertEquals(queue.offer("Test4"), true);
        assertEquals(queue.offer("Test5"), true);
        assertEquals(queue.offer("Test6"), false);
    }

    @Test
    @DisplayName("Testing peek StringQueue")
    public void testPeekStringQueue() {
        assertEquals(queue.peek(), null);

        queue.offer("Test");
        assertEquals(queue.peek(), "Test");

    }

    @Test
    @DisplayName("Testing element StringQueue")
    public void testElementStringQueue() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });

        queue.offer("Test");
        assertEquals(queue.element(), "Test");

    }

}