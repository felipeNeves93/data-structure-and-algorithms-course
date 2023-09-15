package com.content.linkedlist.exercises.reversebetween;

import com.content.linkedlist.implementation.LinkedList;
import com.content.linkedlist.implementation.Node;

public class ReverseBetweenSolution extends LinkedList {

    public void reverseBetween(int m, int n) {
        // Check: If linked list is empty, nothing to reverse.
        // Exit the method.
        if (getHead() != null) {
            // Create a 'dummyNode' that precedes the head.
            // Simplifies handling edge cases.
            Node dummyNode = new Node(0);
            dummyNode.next = getHead();

            // 'previousNode' is used to navigate to the node
            // right before our sublist begins.
            Node previousNode = dummyNode;

            // Move 'previousNode' to node just before sublist.
            for (int i = 0; i < m; i++) {
                previousNode = previousNode.next;
            }

            // 'currentNode' marks the first node of sublist.
            Node currentNode = previousNode.next;

            // Loop reverses the section from startIndex to endIndex.
            for (int i = 0; i < n - m; i++) {

                // 'nodeToMove' is the node we'll move to sublist start.
                Node nodeToMove = currentNode.next;

                // Detach 'nodeToMove' from its current position.
                currentNode.next = nodeToMove.next;

                // Attach 'nodeToMove' at the beginning of the sublist.
                nodeToMove.next = previousNode.next;

                // Move 'nodeToMove' to the start of our sublist.
                previousNode.next = nodeToMove;
            }

            // Adjust 'head' if the first node was part of sublist.
            setHead(dummyNode.next);
        }

    }

    public ReverseBetweenSolution(int value) {
        super(value);
    }
}
