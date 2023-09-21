package com.content.doublylinkedlist.exercises.ispalindrome;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;

public class IsPalindromeExerciseSolution extends DoublyLinkedList {

    public IsPalindromeExerciseSolution(int value) {
        super(value);
    }

    public boolean isPalindrome() {
        var headPointer = getHead();
        var tailPointer = getTail();

        while (headPointer != null && tailPointer != null) {
            if (headPointer.value != tailPointer.value) {
                return false;
            }
            headPointer = headPointer.next;
            tailPointer = tailPointer.previous;
        }

        return true;
    }

}
