package stack.operations;

import com.content.stack.implementation.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StackPopTests {

    @Test
    void whenPopEmptyStackThenShouldReturnNull() {
        var stack = new Stack();
        var top = stack.pop();

        assertNull(top);
    }

    @Test
    void whenPopToStackWithElementsThenShouldReturnRemovedTop() {
        var stack = new Stack(45);
        stack.push(1);

        var pop = stack.pop();

        final var expectedHeight = 1;
        final var expectedTop = 45;
        final var expectedRemovedValue = 1;

        assertEquals(expectedHeight, stack.getHeight());
        assertEquals(expectedTop, stack.getTop().value);
        assertEquals(expectedRemovedValue, pop.value);
    }

    @Test
    void whenPopToStackWithOneElementThenTopShouldBeNull() {
        var stack = new Stack(45);

        var pop = stack.pop();

        final var expectedHeight = 0;
        final var expectedRemovedValue = 45;

        assertEquals(expectedHeight, stack.getHeight());
        assertNull(stack.getTop());
        assertEquals(expectedRemovedValue, pop.value);
    }

}
