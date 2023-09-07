package linkedList;

import com.content.linkedlist.implementation.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListSetTests {

    @Test
    void whenSetWithEmptyListThenShouldReturnFalse() {
        var linkedList = new LinkedList();
        assertFalse(linkedList.set(4, 2));
    }

    @Test
    void whenSetValueAtGivenIndexThenShouldReturTrue() {
        var linkedList = new LinkedList(1);
        linkedList.append(2);

        assertTrue(linkedList.set(0, 34));
        assertEquals(34, linkedList.get(0).value);
    }
}
