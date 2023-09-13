package com.content.linkedlist.exercises.removeduplicate;

import com.content.linkedlist.implementation.LinkedList;
import com.content.linkedlist.implementation.Node;

import java.util.HashSet;

public class RemoveDuplicateSolution extends LinkedList {

    public RemoveDuplicateSolution(int value) {
        super(value);
    }

    public void removeDuplicates() {
        if (getHead() != null) {
            var unrepeatedValues = new HashSet<Integer>();
            var temp = getHead();

            while (temp != null) {
                unrepeatedValues.add(temp.value);
                temp = temp.next;
            }

            var current = getHead();
            var previous = current;

            for (Integer value : unrepeatedValues) {
                var newNode = new Node(value);
                current.next = newNode;
                current = newNode;
            }

            setLength(unrepeatedValues.size());
            setHead(previous.next);
        }
    }
}
