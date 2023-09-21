package doublylinkedlist.exercises;

import com.content.doublylinkedlist.exercises.ispalindrome.IsPalindromeExerciseSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPalindromeExerciseTest {

    @Test
    void whenDoublyLinkedListIsPalindromeThenShouldReturnTrue() {
        var doublyLinkedList = new IsPalindromeExerciseSolution(5);
        doublyLinkedList.append(4);
        doublyLinkedList.append(3);
        doublyLinkedList.append(2);
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);

        var isPalindrome = doublyLinkedList.isPalindrome();

        assertTrue(isPalindrome);
    }

    @Test
    void whenDoublyLinkedListIsnotPalindromeThenShouldReturnFalse() {
        var doublyLinkedList = new IsPalindromeExerciseSolution(5);
        doublyLinkedList.append(4);
        doublyLinkedList.append(2);
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);

        var isPalindrome = doublyLinkedList.isPalindrome();

        assertFalse(isPalindrome);
    }
}
