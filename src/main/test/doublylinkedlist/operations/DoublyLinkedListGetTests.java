package doublylinkedlist.operations;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DoublyLinkedListGetTests {

    @Test
    void whenGettingNodeAtValidGivenIndexThenShouldReturnNode() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        final var expectedValue = 3;

        var searchedNode = doublyLinkedList.get(2);

        assertEquals(expectedValue, searchedNode.value);
    }

    @Test
    void whenGettingNodeAtInvalidIndexThenShouldReturnNull() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        var searchedNode = doublyLinkedList.get(6);

        assertNull(searchedNode);
    }

    @Test
    void whenGettingNodeAtEmptyListThenShouldReturnNull() {
        var doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(3);

        doublyLinkedList.makeEmpty();

        var searchedNode = doublyLinkedList.get(6);

        assertNull(searchedNode);
    }
}
