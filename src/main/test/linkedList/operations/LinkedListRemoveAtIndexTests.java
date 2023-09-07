package linkedList.operations;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListRemoveAtIndexTests {

    @Test
    void whenRemoveFromEmptyListThenShouldReturnNull() {
        var linkedList = new LinkedList();
        var value = linkedList.remove(0);

        assertNull(value);
    }

    @Test
    void whenRemoveAtGivenIndexThenShouldReturnRemovedNode() {
        var linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        final var removedElement = linkedList.remove(2);
        final var expectedTail = 4;
        final var expectedRemovedElement = 3;
        final var expectedLength = 3;

        assertEquals(expectedRemovedElement, removedElement.value);
        assertEquals(expectedTail, linkedList.getTail().value);
        assertEquals(expectedLength, linkedList.getLength());
    }
}
