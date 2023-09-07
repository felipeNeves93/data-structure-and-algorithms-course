package linkedList.operations;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListRemoveFirstTests {

    @Test
    void whenRemoveFromEmptyListThenShouldReturnNull() {
        var linkedList = new LinkedList();
        var value = linkedList.removeFirst();

        assertNull(value);
    }

    @Test
    void whenRemoveFirstElementThenShouldReturnPreviousElement() {
        var linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);

        final var removedElement = linkedList.removeFirst();
        final var expectedTail = 3;
        final var expectedRemovedElement = 1;
        final var expectedHeadElement = 2;

        assertEquals(expectedRemovedElement, removedElement.value);
        assertEquals(expectedTail, linkedList.getTail().value);
        assertEquals(expectedHeadElement, linkedList.getHead().value);
    }
}
