package linkedList.operations;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListRemoveLastTests {

    @Test
    void whenRemoveFromEmptyListThenShouldReturnNull() {
        var linkedList = new LinkedList();
        var value = linkedList.removeLast();

        assertNull(value);
    }

    @Test
    void whenRemoveLastElementThenShouldReturnPreviousElement() {
        var linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);

        final var removedElement = linkedList.removeLast();
        final var expectedTail = 2;
        final var expectedRemovedElement = 3;

        assertEquals(expectedRemovedElement, removedElement.value);
        assertEquals(expectedTail, linkedList.getTail().value);
    }
}
