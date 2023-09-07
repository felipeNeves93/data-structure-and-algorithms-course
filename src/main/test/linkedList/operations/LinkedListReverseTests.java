package linkedList.operations;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListReverseTests {

    @Test
    void whenReverseLinkedListThenHeadAndTailShouldBeReversed() {
        var linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        var currentHead = linkedList.getHead();
        var currentTail = linkedList.getTail();

        assertEquals(1, currentHead.value);
        assertEquals(5, currentTail.value);

        linkedList.reverse();

        currentHead = linkedList.getHead();
        currentTail = linkedList.getTail();

        assertEquals(5, currentHead.value);
        assertEquals(1, currentTail.value);
    }
}
