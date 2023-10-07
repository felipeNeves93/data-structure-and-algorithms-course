package stack.operations;

import com.content.stack.implementation.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackPushTests {

    @Test
    void whenPushToEmptyStackThenNodeShouldBeTop() {
        var stack = new Stack();
        stack.push(1);

        final var expectedHeight = 1;
        final var expectedTop = 1;

        assertEquals(expectedHeight, stack.getHeight());
        assertEquals(expectedTop, stack.getTop().value);
    }

    @Test
    void whenPushToStackContainingElementsThenNewNodeShouldBeTop() {
        var stack = new Stack(45);
        stack.push(1);

        final var expectedHeight = 2;
        final var expectedTop = 1;
        final var expectedNext = 45;

        assertEquals(expectedHeight, stack.getHeight());
        assertEquals(expectedTop, stack.getTop().value);
        assertEquals(expectedNext, stack.getTop().next.value);
    }


}
