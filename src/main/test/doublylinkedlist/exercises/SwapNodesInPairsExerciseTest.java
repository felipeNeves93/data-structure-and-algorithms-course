package doublylinkedlist.exercises;

import com.content.doublylinkedlist.exercises.swapnodesinparis.SwapNodesInPairsExerciseSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapNodesInPairsExerciseTest {

    @Test
    void whenSwapPairsInListThenListShouldReturnSwapedPairs() {
        var doublyLinkedList = new SwapNodesInPairsExerciseSolution(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        final var expectedHeadValue = 2;
        final var expectedHeadNext = 1;

        doublyLinkedList.swapNodePairs();

        assertEquals(expectedHeadValue, doublyLinkedList.getHead().value);
        assertEquals(expectedHeadNext, doublyLinkedList.getHead().next.value);
    }
}
