package com.content.doublylinkedlist.exercises.swapfirstandlast;

import com.content.doublylinkedlist.implementation.DoublyLinkedList;

public class SwapFirstLastSolution extends DoublyLinkedList {

    public SwapFirstLastSolution(int value) {
        super(value);
    }

    public void swapFirstLast() {
        if (getLength() >= 2) {
            var tempHeadValue = getHead().value;
            getHead().value = getTail().value;
            getTail().value = tempHeadValue;
            System.out.println("Swapping head and tail");
            System.out.println("New Head : " + getHead().value + " New Tail: " + getTail().value);
        }
    }
}
