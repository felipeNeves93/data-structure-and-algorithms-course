package linkedList;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListAppendTests {

    @Test
    void whenAppendToAnEmptyListThenShouldCreateHeadAndTail() {
        var linkedList = new LinkedList();
        linkedList.append(1);

        final var expectedLength = 1;
        final var expectedValue = 1;

        assertEquals(expectedLength, linkedList.getLength());
        assertEquals(expectedValue, linkedList.getHead().value);
        assertEquals(expectedValue, linkedList.getTail().value);
    }

    @Test
    void whenAppendToAnExistingListThenShouldChangeTailOnly() {
        var linkedList = new LinkedList(1);
        linkedList.append(2);

        final var expectedLength = 2;
        final var expectedHeadValue = 1;
        final var expectedTailValue = 2;

        assertEquals(expectedLength, linkedList.getLength());
        assertEquals(expectedHeadValue, linkedList.getHead().value);
        assertEquals(expectedTailValue, linkedList.getTail().value);
    }
}
