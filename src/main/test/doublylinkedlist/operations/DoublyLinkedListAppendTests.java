package doublylinkedlist.operations;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoublyLinkedListAppendTests {

    @Test
    void whenAppendingToListThenShouldPointToRightNodes() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);

        final var expectedLength = 3;
        final var expectedHead = 1;
        final var expectedTail = 3;

        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedHead, doublyLinkedList.getHead().value);
        assertEquals(expectedTail, doublyLinkedList.getTail().value);
    }

    @Test
    void whenAppendingToEmptyListThenHeadAndTailShouldPointToNewNode() {
        var doublyLinkedList = new DoublyLinkedList(1);

        doublyLinkedList.makeEmpty();
        doublyLinkedList.append(2);

        final var expectedHead = 2;
        final var expectedTail = 2;
        final var expectedLength = 1;


        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedHead, doublyLinkedList.getHead().value);
        assertEquals(expectedTail, doublyLinkedList.getTail().value);
    }
}
