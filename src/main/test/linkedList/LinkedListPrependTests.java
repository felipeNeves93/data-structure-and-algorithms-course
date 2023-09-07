package linkedList;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListPrependTests {

    @Test
    void whenPrependWithEmptyListThenShouldReturnLength1() {
        var linkedList = new LinkedList();
        linkedList.prepend(1);

        assertEquals(1, linkedList.getLength());
    }

    @Test
    void whenPrependIntoExistingListThenShouldPutElementAtBegining() {
        var linkedList = new LinkedList(1);
        linkedList.prepend(2);

        final var lengthExpected = 2;
        final var headExpectedValue = 2;

        assertEquals(lengthExpected, linkedList.getLength());
        assertEquals(headExpectedValue, linkedList.getHead().value);
    }
}
