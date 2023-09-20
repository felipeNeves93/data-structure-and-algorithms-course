package doublylinkedlist.exercises;

import com.content.doublylinkedlist.exercises.swapfirstandlast.SwapFirstLastSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapFirstLastExerciseTest {

    @Test
    void whenSwappingFirstLastWithMoreThanTwoNodesThenShouldSwapList() {
        var doublyLinkedList = new SwapFirstLastSolution(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        final var expectedHeadValue = 4;
        final var expectedTailValue = 1;

        doublyLinkedList.swapFirstLast();

        assertEquals(expectedHeadValue, doublyLinkedList.getHead().value);
        assertEquals(expectedTailValue, doublyLinkedList.getTail().value);
    }
}
