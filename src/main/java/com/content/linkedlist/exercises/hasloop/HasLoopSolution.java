package com.content.linkedlist.exercises.hasloop;

import com.content.linkedlist.implementation.LinkedList;

public class HasLoopSolution extends LinkedList {

    public HasLoopSolution(int value) {
        super(value);
    }

    public boolean hasLoop() {
        var slowPointer = getHead();
        var fastPointer = getHead();

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            // has loop
            if (fastPointer != null && fastPointer.equals(slowPointer)) {
                return true;
            }
        }
        return false;
    }
}
