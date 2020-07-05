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

    /**
     * Tests if the method offer works and also if the contructor with maxsize works right.
     * For that we add more than 6 objects and if the seventh object false then it works.
     */
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

    /**
     * Tests if the method peek works.
     * For that we peek at first and if the return value null it works correct.
     * Then we add an object and peek again, if the return value is the added object it works correct,
     */
    @Test
    @DisplayName("Testing peek Queue")
    public void testPeekQueue() {
        assertEquals(queue.peek(), null);

        queue.offer(1);
        assertEquals(queue.peek(), 1);

    }

    /**
     * Tests if the method element works.
     * For that we use the element method at first and if a Exception is thrown then it works correct
     * Then we add an object and use the element method again, if the return value is the added object it works correct,
     */
    @Test
    @DisplayName("Testing element Queue")
    public void testElementQueue() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });

        queue.offer(1);
        assertEquals(queue.element(), 1);

    }

    /**
     * Tests if the method poll works.
     * For that we add an object and use the poll method if the return value is the object it works correct
     * Then we use the method again now the return value must null
     */
    @Test
    @DisplayName("Testing poll Queue")
    public void testPollQueue() {
        queue.offer(1);
        assertEquals(queue.poll(), 1);

        assertEquals(queue.poll(), null);

    }

    /**
     * Tests if the method remove works.
     * For that we add an object and use the remove method if the return value is the object it works correct
     * Then we use the method again now the method should threw an Exception
     */
    @Test
    @DisplayName("Testing remove Queue")
    public void testRemoveQueue() {
        queue.offer(1);
        assertEquals(queue.remove(), 1);

        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }


}
