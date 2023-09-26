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

    /**
     * Print all the values of the stack
     */
    public void printStack() {
        var temp = top;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next
        }
    }

}
