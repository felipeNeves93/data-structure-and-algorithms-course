package doublylinkedlist.exercises;

import com.content.doublylinkedlist.exercises.reverse.ReverseExerciseSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseExerciseTest {

    @Test
    void whenReverseListThenShouldReverseHeadAndTail() {
        var doublyLinkedList = new ReverseExerciseSolution(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        final var expectedHeadValue = 4;
        final var expectedTailValue = 1;

        doublyLinkedList.reverse();

        assertEquals(expectedHeadValue, doublyLinkedList.getHead().value);
        assertEquals(expectedTailValue, doublyLinkedList.getTail().value);
    }
}
