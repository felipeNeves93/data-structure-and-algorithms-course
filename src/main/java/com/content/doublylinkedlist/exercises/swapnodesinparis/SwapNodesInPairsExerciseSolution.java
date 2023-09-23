package com.content.doublylinkedlist.exercises.swapnodesinparis;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;
import com.content.doublylinkedlist.implementation.Node;

public class SwapNodesInPairsExerciseSolution extends DoublyLinkedList {
    public SwapNodesInPairsExerciseSolution(int value) {
        super(value);
    }

    public void swapNodePairs() {
        // Create a placeholder (dummyNode) node to simplify swapping.
        var dummyNode = new Node(0);

        // Link the dummyNode node to the start of our list.
        dummyNode.next = getHead();

        // Initialize 'previousNode' to 'dummyNode' to remember the node
        // before each pair we're swapping.
        Node previousNode = dummyNode;

        // Continue as long as there's a pair of nodes to swap.
        while (getHead() != null && getHead().next != null) {

            // Identify the first node of the pair to swap.
            var firstNode = getHead();

            // Identify the second node of the pair to swap.
            var secondNode = getHead().next;

            // Connect the previousNode's 'next' pointer to secondNode,
            // essentially skipping over firstNode.
            previousNode.next = secondNode;

            // Connect firstNode to the node after secondNode.
            // This ensures we don't lose the rest of the list.
            firstNode.next = secondNode.next;

            // Connect secondNode back to firstNode,
            // completing the swap.
            secondNode.next = firstNode;

            // Adjust 'prev' pointers for our doubly linked list.
            // Set secondNode's 'prev' to the node before current pair.
            secondNode.previous = previousNode;

            // Set firstNode's 'prev' to secondNode as they've been swapped.
            firstNode.previous = secondNode;

            // If there's a node after our current pair, set its 'prev' to firstNode.
            if (firstNode.next != null) {
                firstNode.next.previous = firstNode;
            }

            // Move the head pointer to the node after the current pair.
            setHead(firstNode.next);

            // Update 'previousNode' for the next pair of nodes.
            previousNode = firstNode;
        }

        // After swapping all pairs, update our list's head to
        // start at the node after dummyNode.
        setHead(dummyNode.next);

        // Ensure the new head's 'prev' is null, indicating the start of list.
        if (getHead() != null) getHead().previous = null;
    }
}
