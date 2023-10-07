package com.content.stack.implementation;

public class Stack {
    private Node top;
    private int height;

    // Getters and Setters
    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Stack(int value) {
        var node = new Node(value);
        top = node;
        height = 1;
    }

    public Stack() {
        top = null;
        height = 0;
    }

    /**
     * Print all the values of the stack
     */
    public void printStack() {
        var temp = top;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /**
     * Adds an element to the begining of the stack
     *
     * @param value The value to be added
     */
    public void push(int value) {
        var newNode = new Node(value);

        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    /**
     * Removes the top node.
     *
     * @return The removed top node
     */
    public Node pop() {
        if (height == 0) {
            return null;
        }

        var temp = top;
        top = temp.next;

        height--;

        return temp;
    }
}
