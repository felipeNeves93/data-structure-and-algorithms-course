package doublylinkedlist.operations;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DoublyLinkedListRemoveTests {

    @Test
    void whenRemovingNodeAtValidIndexThenShouldReturnRemovedNode() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        final var expectedRemovedNode = 3;
        final var expectedPreviousNode = 2;
        final var expectedNextNode = 4;
        final var expectedLength = 3;

        var removedNode = doublyLinkedList.remove(2);
        var previousNode = doublyLinkedList.get(1);
        var nextNode = doublyLinkedList.get(2);

        assertEquals(expectedRemovedNode, removedNode.value);

        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedNextNode, nextNode.value);
        assertEquals(expectedPreviousNode, previousNode.value);
    }

    @Test
    void whenRemovingNodeAtInvalidIndexThenShouldReturnFalse() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        var updateNode = doublyLinkedList.remove(6);

        assertNull(updateNode);
    }

    @Test
    void whenRemovingNodeFromEmptyListThenShouldReturnNull() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        doublyLinkedList.makeEmpty();

        var removeNode = doublyLinkedList.remove(6);

        assertNull(removeNode);
    }
}
