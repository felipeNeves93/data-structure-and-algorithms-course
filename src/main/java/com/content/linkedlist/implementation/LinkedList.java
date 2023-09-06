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
        System.out.println("------------------------------------------End of the list---------------------------");
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

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node previous = head;
        Node current = head;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        tail = previous;
        tail.next = null;

        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        System.out.println("Removing node: " + current.value);
        return current;
    }

    public void prepend(int value) {
        var node = new Node(value);

        if (length == 0) {
            head = node;
            tail = node;

        } else {
            node.next = head;
            head = node;
        }

        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        var temp = head;

        if (length == 1) {
            tail = null;
            head = null;
            length--;

            System.out.println("Removing the node: " + temp.value);
            return temp;
        }

        head = head.next;
        length--;
        System.out.println("Removing the node: " + temp.value);
        return temp;
    }
}
