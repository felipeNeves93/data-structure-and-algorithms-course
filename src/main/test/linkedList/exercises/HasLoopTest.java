package linkedList.exercises;

import com.content.linkedlist.exercises.hasloop.HasLoopSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HasLoopTest {

    @Test
    void whenLinkedListIsCreatedWithoutLoopThenShouldReturnFalse() {
        var linkedList = new HasLoopSolution(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        assertFalse(linkedList.hasLoop());
    }

    @Test
    void whenLinkedListIsCreatedWitLoopThenShouldReturnTrue() {
        var linkedList = new HasLoopSolution(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.getHead().next.next.next = linkedList.getHead();

        assertTrue(linkedList.hasLoop());
    }
}
