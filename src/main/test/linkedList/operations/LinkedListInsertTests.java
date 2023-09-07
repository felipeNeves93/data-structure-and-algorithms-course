package linkedList.operations;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListInsertTests {

    @Test
    void whenInsertWithInvalidIndexThenShouldReturnFalse() {
        var linkedList = new LinkedList();
        assertFalse(linkedList.insert(4, 2));
    }

    @Test
    void whenInsertAtIndex0ThenShouldReturnTrue() {
        var linkedList = new LinkedList(1);
        var result = linkedList.insert(0, 2);
        final var expectedLength = 2;
        final var expectedValue = 2;

        assertTrue(result);
        assertEquals(expectedLength, linkedList.getLength());
        assertEquals(expectedValue, linkedList.getHead().value);
    }

    @Test
    void whenInsertAtLastIndexThenShouldReturnTrue() {
        var linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);

        var result = linkedList.insert(2, 45);
        final var expectedLength = 4;
        final var expectedValue = 45;

        assertTrue(result);
        assertEquals(expectedLength, linkedList.getLength());
        assertEquals(expectedValue, linkedList.getTail().value);
    }

    @Test
    void whenInsertAtSpecificIndexThenShouldReturnTrue() {
        var linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);

        var result = linkedList.insert(1, 75);
        final var expectedLength = 4;
        final var expectedValue = 75;

        assertTrue(result);
        assertEquals(expectedLength, linkedList.getLength());
        assertEquals(expectedValue, linkedList.get(1).value);
    }
}
