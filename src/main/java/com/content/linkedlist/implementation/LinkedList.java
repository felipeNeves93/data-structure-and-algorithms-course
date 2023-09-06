package com.content.linkedlist.implementation;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // Inner class representing the values of the list
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Initialize the list with just one element, that will be both the head and tail
    public LinkedList(int value) {
        var node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printList() {
        var temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        var newNode = new Node(value);

        // If the list is empty, set both tail and node to point to the newNode
        if (length == 0) {
            head = newNode;
            tail = newNode;
            // When the list is not empty, first with have to update the reference of the current node to point to the new one.
            // Next, we have to update the pointer to point to the new Node
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public void removeLast() {
        if (length == 1) {
            head = null;
            tail = null;
        } else if (length > 1) {
            var currentNode = head.next;
            var previousNode = head;

            // Find the last element of the list to remove, and update the references
            while (currentNode != tail) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            System.out.println("Removing the last node: " + currentNode.value);
            // Remove the last element and set the previous node as tail
            previousNode.next = null;
            tail = previousNode;
        }
        length--;
    }
}
