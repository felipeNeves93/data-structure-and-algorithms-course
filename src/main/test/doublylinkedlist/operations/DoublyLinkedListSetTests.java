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
