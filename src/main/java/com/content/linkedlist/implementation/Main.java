package com.content.linkedlist.implementation;

public class Main {
    public static void main(String... args) {
        var myLinkedList = new LinkedList(4);
        myLinkedList.append(10);
        myLinkedList.append(145);
        myLinkedList.append(25);

        myLinkedList.printList();

        myLinkedList.removeLast();
        myLinkedList.printList();

        myLinkedList.removeLast();
        myLinkedList.printList();

        myLinkedList.removeLast();
        myLinkedList.printList();

        myLinkedList.removeLast();
        myLinkedList.printList();
    }
}
