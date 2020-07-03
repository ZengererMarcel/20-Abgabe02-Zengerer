package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

/**
 * Class which tests the methods of Queue
 */
public class QueueTest_String {
    Queue queue;

    /**
     * Init a StringQueue for each test
     */
    @BeforeEach
    void setup() {
        queue = new Queue(6);
    }

    @Test
    @DisplayName("Testing offer Queue")
    public void testOfferQueue() {
        assertEquals(queue.offer("Test"), true);
        assertEquals(queue.offer("Test2"), true);
        assertEquals(queue.offer("Test3"), true);
        assertEquals(queue.offer("Test4"), true);
        assertEquals(queue.offer("Test5"), true);
        assertEquals(queue.offer("Test6"), true);
        assertEquals(queue.offer("Test6"), false);
    }

    @Test
    @DisplayName("Testing peek Queue")
    public void testPeekQueue() {
        assertEquals(queue.peek(), null);

        queue.offer("Test");
        assertEquals(queue.peek(), "Test");

    }

    @Test
    @DisplayName("Testing element Queue")
    public void testElementQueue() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });

        queue.offer("Test");
        assertEquals(queue.element(), "Test");

    }

    @Test
    @DisplayName("Testing poll Queue")
    public void testPollQueue() {

        assertEquals(queue.poll(), null);

        queue.offer("Test");
        assertEquals(queue.poll(), "Test");

    }

    @Test
    @DisplayName("Testing remove Queue")
    public void testRemoveQueue() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });

        queue.offer("Test");
        assertEquals(queue.remove(), "Test");
    }


}
