package linkedList.exercises;

import com.content.linkedlist.exercises.reversebetween.ReverseBetweenSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseBetweenExerciseTests {

    @Test
    void givenLinkedListWithDuplicateThenShouldRemoveDuplicates() {
        // list: 1 2 3 4 5 6
        var linkedList = new ReverseBetweenSolution(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        linkedList.reverseBetween(2, 4);

        assertEquals(5, linkedList.get(2).value);
        assertEquals(4, linkedList.get(3).value);
        assertEquals(3, linkedList.get(4).value);
    }
}
