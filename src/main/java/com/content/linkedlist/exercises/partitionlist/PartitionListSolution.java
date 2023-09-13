package com.content.linkedlist.exercises.partitionlist;

import com.content.linkedlist.implementation.LinkedList;
import com.content.linkedlist.implementation.Node;

public class PartitionListSolution extends LinkedList {

    public PartitionListSolution(int value) {
        super(value);
    }

    public void partitionList(int x) {
        if (getHead() != null && getHead().next != null) {
            Node nodesLesserThanX = new Node(0);
            Node nodesGreaterOrEqualThanX = new Node(0);

            var previousLesserThanX = nodesLesserThanX;
            var previousGreaterThanX = nodesGreaterOrEqualThanX;

            var temp = getHead();

            while (temp != null) {
                if (temp.value < x) {
                    nodesLesserThanX.next = temp;
                    nodesLesserThanX = temp;

                } else {
                    nodesGreaterOrEqualThanX.next = temp;
                    nodesGreaterOrEqualThanX = temp;
                }
                temp = temp.next;
            }

            nodesGreaterOrEqualThanX.next = null;
            nodesLesserThanX.next = previousGreaterThanX.next;

            setHead(previousLesserThanX.next);
        }
    }

}
