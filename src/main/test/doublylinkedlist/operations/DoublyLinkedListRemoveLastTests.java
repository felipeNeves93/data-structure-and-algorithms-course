package doublylinkedlist.operations;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DoublyLinkedListRemoveLastTests {

    @Test
    void whenRemovingLastElementThenShouldReturnRemovedElement() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);

        final var expectedLength = 2;
        final var expectedTail = 2;
        final var expectedRemovedValue = 3;

        var removedNode = doublyLinkedList.removeLast();

        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedTail, doublyLinkedList.getTail().value);
        assertEquals(expectedRemovedValue, removedNode.value);
    }

    @Test
    void whenRemovingLastlementFromEmptyListThenShouldReturnNull() {
        var doublyLinkedList = new DoublyLinkedList(1);

        doublyLinkedList.makeEmpty();

        var removedNode = doublyLinkedList.removeLast();

        assertNull(removedNode);
    }

    @Test
    void whenRemovingLastElementFromListWithOneElementThenShouldEmptyTheList() {
        var doublyLinkedList = new DoublyLinkedList(1);

        final var expectedLength = 0;
        final var expectedRemovedValue = 1;

        var removedNode = doublyLinkedList.removeLast();

        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedRemovedValue, removedNode.value);
        assertNull(doublyLinkedList.getHead());
        assertNull(doublyLinkedList.getTail());
    }
}
