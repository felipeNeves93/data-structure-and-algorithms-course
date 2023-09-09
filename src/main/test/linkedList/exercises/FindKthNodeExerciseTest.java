package linkedList.exercises;

import com.content.linkedlist.exercises.findkthnode.FindKthNodeSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FindKthNodeExerciseTest {

    @Test
    void whenKthElementIsAValidOneThenShouldReturnTheNode() {
        var linkedList = new FindKthNodeSolution(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        final var expectedKthValue = 4;
        var kthNode = linkedList.findKthFromEnd(2);

        assertEquals(expectedKthValue, kthNode.value);
    }

    @Test
    void whenKthElementIsNotAValidOneThenShouldReturnNull() {
        var linkedList = new FindKthNodeSolution(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        var kthNode = linkedList.findKthFromEnd(10);

        assertNull(kthNode);
    }
}
