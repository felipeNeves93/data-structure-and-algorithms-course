package linkedList.exercises;

import com.content.linkedlist.exercises.removeduplicate.RemoveDuplicateSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateExerciseTest {

    @Test
    void givenLinkedListWithDuplicateThenShouldRemoveDuplicates() {
        // list: 1 1 2 2 3 3
        var linkedList = new RemoveDuplicateSolution(1);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(3);

        linkedList.removeDuplicates();
        assertEquals(1, linkedList.get(0).value);
        assertEquals(2, linkedList.get(1).value);
        assertEquals(3, linkedList.get(2).value);
        assertEquals(3, linkedList.getLength());
    }

    @Test
    void givenLinkedListWithNoRepeatedValuesThenShouldDoNothing() {
        var linkedList = new RemoveDuplicateSolution(1);
        linkedList.append(2);

        assertEquals(1, linkedList.get(0).value);
        assertEquals(2, linkedList.get(1).value);
        assertEquals(2, linkedList.getLength());
    }
}
