package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest_Integer {
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
        assertEquals(queue.offer(1), true);
        assertEquals(queue.offer(2), true);
        assertEquals(queue.offer(3), true);
        assertEquals(queue.offer(4), true);
        assertEquals(queue.offer(5), true);
        assertEquals(queue.offer(6), true);
        assertEquals(queue.offer(7), false);
    }

    @Test
    @DisplayName("Testing peek Queue")
    public void testPeekQueue() {
        assertEquals(queue.peek(), null);

        queue.offer(1);
        assertEquals(queue.peek(), 1);

    }

    @Test
    @DisplayName("Testing element Queue")
    public void testElementQueue() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });

        queue.offer(1);
        assertEquals(queue.element(), 1);

    }

    @Test
    @DisplayName("Testing poll Queue")
    public void testPollQueue() {

        assertEquals(queue.poll(), null);

        queue.offer(1);
        assertEquals(queue.poll(), 1);

    }

    @Test
    @DisplayName("Testing remove Queue")
    public void testRemoveQueue() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });

        queue.offer(1);
        assertEquals(queue.remove(), 1);
    }


}
