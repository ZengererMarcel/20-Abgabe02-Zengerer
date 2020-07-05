package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

/**
 * Class which tests the methods of StringQueue
 */
public class StringQueueTest {
    StringQueue queue;

    /**
     * Init a StringQueue for each test
     */
    @BeforeEach
    void setup() {
        queue = new StringQueue(6);
    }

    /**
     * Tests if the method offer works and also if the contructor with maxsize works right.
     * For that we add more than 6 objects and if the seventh object false then it works.
     */
    @Test
    @DisplayName("Testing offer StringQueue")
    public void testOfferStringQueue() {
        assertEquals(queue.offer("Test"), true);
        assertEquals(queue.offer("Test2"), true);
        assertEquals(queue.offer("Test3"), true);
        assertEquals(queue.offer("Test4"), true);
        assertEquals(queue.offer("Test5"), true);
        assertEquals(queue.offer("Test6"), true);
        assertEquals(queue.offer("Test6"), false);
    }

    /**
     * Tests if the method peek works.
     * For that we peek at first and if the return value null it works correct.
     * Then we add an object and peek again, if the return value is the added object it works correct,
     */
    @Test
    @DisplayName("Testing peek StringQueue")
    public void testPeekStringQueue() {
        assertEquals(queue.peek(), null);

        queue.offer("Test");
        assertEquals(queue.peek(), "Test");

    }

    /**
     * Tests if the method element works.
     * For that we use the element method at first and if a Exception is thrown then it works correct
     * Then we add an object and use the element method again, if the return value is the added object it works correct,
     */
    @Test
    @DisplayName("Testing element StringQueue")
    public void testElementStringQueue() {
        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });

        queue.offer("Test");
        assertEquals(queue.element(), "Test");

    }

    /**
     * Tests if the method poll works.
     * For that we add an object and use the poll method if the return value is the object it works correct
     * Then we use the method again now the return value must null
     */
    @Test
    @DisplayName("Testing poll StringQueue")
    public void testPollStringQueue() {

        queue.offer("Test");
        assertEquals(queue.poll(), "Test");

        assertEquals(queue.poll(), null);


    }

    /**
     * Tests if the method remove works.
     * For that we add an object and use the remove method if the return value is the object it works correct
     * Then we use the method again now the method should threw an Exception
     */
    @Test
    @DisplayName("Testing remove StringQueue")
    public void testRemoveStringQueue() {
        queue.offer("Test");
        assertEquals(queue.remove(), "Test");

        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }

}