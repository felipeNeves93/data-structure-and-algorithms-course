package com.content.doublylinkedlist.exercises.reverse;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import com.content.doublylinkedlist.implementation.Node;

public class ReverseExerciseSolution extends DoublyLinkedList {

    public ReverseExerciseSolution(int value) {
        super(value);
    }

    public void reverse() {
        if (getLength() > 1) {
            Node newTail = null;
            var current = getHead();

            while (current != null) {
                newTail = current.previous;
                current.previous = current.next;
                current.next = newTail;
                current = current.previous;
            }

            newTail = getHead();
            setHead(getTail());
            setTail(newTail);
        }
    }
}
