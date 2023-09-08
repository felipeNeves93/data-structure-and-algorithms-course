package linkedList.exercises;

import com.content.linkedlist.exercises.findmiddlenode.FindMiddleNodeSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMiddleNodeExerciseTest {

    @Test
    void whenGivenLinkedListWithSizeFiveReturnMiddleNodeThree() {
        var linkedList = new FindMiddleNodeSolution(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        var middleNode = linkedList.findMiddleNode();

        assertEquals(3, middleNode.value);
    }

    @Test
    void whenGivenLinkedListWithSizeSixReturnMiddleNodeFour() {
        var linkedList = new FindMiddleNodeSolution(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        var middleNode = linkedList.findMiddleNode();

        assertEquals(4, middleNode.value);
    }
}
