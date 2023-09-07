package linkedList;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LinkedListGetTests {

    @Test
    void whenGetWithEmptyListThenShouldReturnNull() {
        var linkedList = new LinkedList();
        assertNull(linkedList.get(0));
    }

    @Test
    void whenPrependIntoExistingListThenShouldPutElementAtBegining() {
        var linkedList = new LinkedList(1);
        linkedList.prepend(2);

        var searchedNode = linkedList.get(1);
        final var expectedValue = 1;

        assertEquals(expectedValue, searchedNode.value);
    }
}
