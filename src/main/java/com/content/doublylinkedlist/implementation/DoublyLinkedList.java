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
        System.out.println("Added the node " + nodeToAppend.value + " to the begining of the list");
        return nodeToAppend;
    }

    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
}
