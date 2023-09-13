package linkedList.exercises;

import com.content.linkedlist.exercises.partitionlist.PartitionListSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitionListExerciseTest {

    @Test
    void givenLinkedListWithMultipleValuesThenShouldPartition() {
        // list: 9 2 3 5 7 11 14 12
        var linkedList = new PartitionListSolution(9);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(5);
        linkedList.append(7);
        linkedList.append(11);
        linkedList.append(14);
        linkedList.append(12);

        linkedList.partitionList(6);
        assertEquals(2, linkedList.get(0).value);
        assertEquals(12, linkedList.get(7).value);
    }

    @Test
    void givenLinkedListWithOneValueShouldDoNothing() {
        var linkedList = new PartitionListSolution(1);
        linkedList.partitionList(45);

        assertEquals(1, linkedList.get(0).value);
    }
}
