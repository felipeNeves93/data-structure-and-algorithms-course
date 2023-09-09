package com.content.linkedlist.exercises.findkthnode;

import com.content.linkedlist.implementation.LinkedList;
import com.content.linkedlist.implementation.Node;

public class FindKthNodeSolution extends LinkedList {
    public FindKthNodeSolution(int value) {
        super(value);
    }

    // Solution with the two pointer technique
    public Node findKthFromEnd(int k) {
        var slowPointer = getHead();
        var fastPointer = getHead();

        // Moves the fast pointer forward k times
        for (int i = 0; i < k; i++) {
            // If this pointer is null, means that the kth element
            // is bigger than the list length
            if (fastPointer == null) {
                return null;
            }

            fastPointer = fastPointer.next;
        }

        // While the fast pointer is not null, move forward
        // the slow pointer. When fast pointer is null,
        // the slow pointer will be at the kth element
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }
}
