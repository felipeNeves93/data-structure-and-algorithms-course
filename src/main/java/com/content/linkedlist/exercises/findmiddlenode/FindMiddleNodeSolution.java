package com.content.linkedlist.exercises.findmiddlenode;

import com.content.linkedlist.implementation.LinkedList;
import com.content.linkedlist.implementation.Node;

public class FindMiddleNodeSolution extends LinkedList {

    public FindMiddleNodeSolution(int value) {
        super(value);
    }

    public Node findMiddleNode() {
        var slowPointer = getHead();
        var fastPointer = getHead();

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }
}
