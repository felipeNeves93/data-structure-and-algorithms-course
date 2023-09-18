package doublylinkedlist.operations;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DoublyLinkedListRemoveFirstTests {

    @Test
    void whenRemovingFirstElementThenShouldReturnRemovedElement() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);

        final var expectedLength = 2;
        final var expectedHead = 2;
        final var expectedRemovedValue = 1;

        var removedNode = doublyLinkedList.removeFirst();

        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedHead, doublyLinkedList.getHead().value);
        assertEquals(expectedRemovedValue, removedNode.value);
    }

    @Test
    void whenRemovingFirstlementFromEmptyListThenShouldReturnNull() {
        var doublyLinkedList = new DoublyLinkedList(1);

        doublyLinkedList.makeEmpty();

        var removedNode = doublyLinkedList.removeFirst();

        assertNull(removedNode);
    }

    @Test
    void whenRemovingFirstElementFromListWithOneElementThenShouldEmptyTheList() {
        var doublyLinkedList = new DoublyLinkedList(1);

        final var expectedLength = 0;
        final var expectedRemovedValue = 1;

        var removedNode = doublyLinkedList.removeFirst();

        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedRemovedValue, removedNode.value);
        assertNull(doublyLinkedList.getHead());
        assertNull(doublyLinkedList.getTail());
    }
}
