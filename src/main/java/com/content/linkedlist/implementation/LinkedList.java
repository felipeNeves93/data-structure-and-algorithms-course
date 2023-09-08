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

    /**
     * Insert a new node at the specified index.
     * If the index is 0, will use the 'prepend' method.
     * If index == length, will use the 'append' method.
     * If is at one of the remaining positions, will move the existing
     * node and all the remaining nodes +1 position forward.
     *
     * @param index The index of the Node.
     * @param value The value that is going to be inserted
     * @return true if the operation is succesfull. False if an error occurs.
     */
    public boolean insert(int index, int value) {
        if (index < 0 || index >= length) {
            System.out.println("Invalid index!");
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length - 1) {
            append(value);
            return true;
        }

        var current = get(index);
        var previous = get(index - 1);

        var tempNode = current;

        current = new Node(value);
        current.next = tempNode;
        previous.next = current;
        length++;

        return true;
    }

    /**
     * Remove the node at the given index.
     *
     * @param index The index of the node
     * @return The node to be removed
     */
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        var previousNode = get(index - 1);
        var currentNode = get(index);

        previousNode.next = currentNode.next;

        System.out.println("Removing node: " + currentNode.value + " at index: " + index);
        length--;
        return currentNode;
    }

    /**
     * Will reverse the linked list. The traversal arrow will point backwards
     */
    public void reverse() {
        printList();
        var temp = head;
        head = tail;
        tail = temp;
        var next = temp.next;
        Node previous = null;

        for (int i = 0; i < length; i++) {
            next = temp.next;
            temp.next = previous;
            previous = temp;
            temp = next;
        }
        printList();
    }
}
