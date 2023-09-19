package doublylinkedlist.operations;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListInsertTests {

    @Test
    void whenInsertingNodeAtValidGivenIndexThenShouldReturnTrue() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        final var expectedValue = 85;
        final var expectedLength = 5;
        final var expectedPrevious = 1;
        final var expectedNext = 3;
        final var expectedPreviousFromNext = 85;

        var insertNode = doublyLinkedList.insert(1, 85);
        var searchedNode = doublyLinkedList.get(1);
        var previousNode = doublyLinkedList.get(2);

        assertTrue(insertNode);

        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedValue, searchedNode.value);
        assertEquals(expectedPrevious, searchedNode.previous.value);
        assertEquals(expectedNext, searchedNode.next.value);
        assertEquals(expectedPreviousFromNext, previousNode.previous.value);
    }

    @Test
    void whenSettingNodeAtInvalidIndexThenShouldReturnFalse() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        var updateNode = doublyLinkedList.set(6, 6);

        assertFalse(updateNode);
    }

    @Test
    void whenSettingNodeAtEmptyListThenShouldReturnFalse() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        doublyLinkedList.makeEmpty();

        var updateNode = doublyLinkedList.set(6, 6);

        assertFalse(updateNode);
    }
}
