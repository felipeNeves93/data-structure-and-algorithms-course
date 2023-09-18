package com.content.doublylinkedlist.implementation;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        var node = new Node(value);

        this.head = node;
        this.tail = node;
        this.length++;
    }

    // Getters and Setters
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Operations

    /**
     * Append a Node to the end of the list.
     *
     * @param value The value of the node.
     * @return The added node
     */
    public Node append(int value) {
        var nodeToAppend = new Node(value);

        if (length == 0) {
            this.head = nodeToAppend;
            this.tail = nodeToAppend;
        } else {
            tail.next = nodeToAppend;
            nodeToAppend.previous = tail;
            tail = nodeToAppend;
        }

        this.length++;
        System.out.println("Added the node " + nodeToAppend.value + " to the list. New length: " + length);
        return nodeToAppend;
    }

    /**
     * Make the list empty by setting head and tail to null and length to 0
     */
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        this.length = 0;
        System.out.println("Emptying list.");
    }

    /**
     * Remove the last node of the list.
     *
     * @return The removed node
     */
    public Node removeLast() {
        if (length == 0) {
            System.out.println("Empty List!");
            return null;
        }
        var temp = tail;

        if (length == 1) {
            tail = null;
            head = null;
            length--;

            System.out.println("Removing the node: " + temp.value + ". List length: " + length);
            return temp;
        }

        var previous = tail.previous;

        previous.next = null;
        tail = previous;
        length--;

        System.out.println("Removing the node: " + temp.value + ". List length: " + length);
        return temp;
    }

    /**
     * Add a node to the begining of the list.
     *
     * @param value The node to add.
     * @return The added node.
     */
    public Node prepend(int value) {
        var newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;

            System.out.println("Adding " + value + " to the begining of the list. Length: " + length);
            return newNode;
        }

        newNode.next = head;
        head.previous = newNode;
        newNode.previous = null;
        head = newNode;
        length++;

        System.out.println("Adding " + value + " to the begining of the list. Length: " + length);
        return newNode;
    }

    /**
     * Will remove the first element of the index
     *
     * @return The removed element
     */
    public Node removeFirst() {
        if (length == 1) {
            var temp = head;
            length--;
            head = null;
            tail = null;

            return temp;

        } else if (length > 1) {
            var temp = head;
            length--;
            head = head.next;
            head.previous = null;

            return temp;
        }

        return null;
    }

    /**
     * Retrieve the node at given index.
     *
     * @param index The index of de node.
     * @return The node.
     */
    public Node get(int index) {
        if (length <= 0 || index >= length) {
            return null;
        }

        var temp = head;
        for (int i = 0; i < length; i++) {
            if (i == index) {
                System.out.println("Returning the value: " + temp.value + " at index: " + index);
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }
}
