package com.content.linkedlist.implementation;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // Initialize the list with just one element, that will be both the head and tail
    public LinkedList(int value) {
        var node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public LinkedList() {

    }

    public void printList() {
        var temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("------------------------------------------End of the list---------------------------");
    }

    public Node getHead() {
        System.out.println("Head: " + head.value);
        return head;
    }

    public Node getTail() {
        System.out.println("Tail: " + tail.value);
        return tail;
    }

    public int getLength() {
        System.out.println("Length: " + length);
        return length;
    }

    /**
     * Will append a node to the end of the list.
     *
     * @param value The value to be added
     */
    public void append(int value) {
        var newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /**
     * Will remove the last element of the list.
     *
     * @return The removed element.
     */
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

    /**
     * Will add a node with the given value to the begining of the list
     *
     * @param value The value that will be inserted.
     */
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

    /**
     * Will remove the first node of the list.
     *
     * @return The removed node.
     */
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

    /**
     * Will search for a node at given index.
     *
     * @param index The position what will be searched
     * @return The Node at given index
     */
    public Node get(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Invalid index!");
            return null;
        }

        var counter = 0;
        var currentNode = head;

        while (counter < index) {
            counter++;
            currentNode = currentNode.next;
        }

        System.out.println("The value of the node at the index: " + index + " is: " + currentNode.value);
        return currentNode;
    }

    /**
     * This method will set the value of the node placed on the specified index
     *
     * @param index The index of the node
     * @param value The value that the node is going to assume at specified index
     * @return true|false depending if the operation is completed or not.
     */
    public boolean set(int index, int value) {
        if (index < 0 || index >= length) {
            System.out.println("Invalid index!");
            return false;
        }

        var counter = 0;
        var currentNode = head;

        while (counter < index) {
            counter++;
            currentNode = currentNode.next;
        }

        currentNode.value = value;
        return true;
    }
}
