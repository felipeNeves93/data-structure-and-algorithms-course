package com.content.linkedlist.implementation;

public class Main {
    public static void main(String... args) {
        var myLinkedList = new LinkedList(1);

        myLinkedList.printList();
        myLinkedList.prepend(25);
        myLinkedList.printList();
    }
}
