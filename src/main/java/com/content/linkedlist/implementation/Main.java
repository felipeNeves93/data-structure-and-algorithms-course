package com.content.linkedlist.implementation;

public class Main {
    public static void main(String... args) {
        var myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        myLinkedList.removeLast();
        myLinkedList.printList();
        System.out.println("-----------------------------------");

        myLinkedList.removeLast();
        myLinkedList.printList();
    }
}
