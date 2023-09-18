package doublylinkedlist.operations;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DoublyLinkedListPrependTests {

    @Test
    void whenPrependingToEmptyListThenShouldReturnSameHeadAndTail() {
        var doublyLinkedList = new DoublyLinkedList(1);

        doublyLinkedList.makeEmpty();
        doublyLinkedList.prepend(1);

        final var expectedLength = 1;
        final var expectedHead = 1;
        final var expectedTail = 1;

        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedHead, doublyLinkedList.getHead().value);
        assertEquals(expectedTail, doublyLinkedList.getTail().value);
    }

    @Test
    void whenPrependingThenShouldReturnPrependedValue() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        var addedNode = doublyLinkedList.prepend(3);

        final var expectedHead = 3;
        final var expectedTail = 2;
        final var expectedLength = 3;


        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedHead, doublyLinkedList.getHead().value);
        assertEquals(expectedTail, doublyLinkedList.getTail().value);
        assertEquals(expectedHead, addedNode.value);
        assertNull(doublyLinkedList.getHead().previous);
    }
}
