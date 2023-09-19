package doublylinkedlist.operations;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListSetTests {

    @Test
    void whenSettingNodeValueAtValidGivenIndexThenShouldReturnTrue() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        final var expectedValue = 85;

        var updateNode = doublyLinkedList.set(1, 85);
        var searchedNode = doublyLinkedList.get(1);

        assertTrue(updateNode);
        assertEquals(expectedValue, searchedNode.value);
    }

    @Test
    void whenInsertingNodeAtInvalidIndexThenShouldReturnFalse() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        var updateNode = doublyLinkedList.insert(6, 6);

        assertFalse(updateNode);
    }

    @Test
    void whenSettingNodeAtEmptyListThenShouldReturnTrue() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        doublyLinkedList.makeEmpty();

        final var expectedLength = 1;
        final var expectedHead = 6;

        var updateNode = doublyLinkedList.insert(0, 6);

        assertTrue(updateNode);
        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedHead, doublyLinkedList.getHead().value);
    }

    @Test
    void whenSettingNodeAtTheEndOfTheListThenShouldReturnTrue() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        final var expectedLength = 5;
        final var expectedTail = 6;

        var updateNode = doublyLinkedList.insert(3, 6);

        assertTrue(updateNode);
        assertEquals(expectedLength, doublyLinkedList.getLength());
        assertEquals(expectedTail, doublyLinkedList.getTail().value);
    }
}
