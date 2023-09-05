***What is an Linked List?***

A linked list is a data structure that consists of a chain of nodes. 
Each node contains data and a reference (or link) to the next node in the chain. 
The first node in the chain is called the head, and the last node is called the tail.

LinkedLists are a dynamic data structure, which means that they can grow and shrink as needed.
This is in contrast to arrays, which are a static data structure with a fixed size.


***What is the main difference between Linked Lists and Array Lists?***

The main difference between a linked list and an ArrayList is how they store their elements. An ArrayList stores its elements 
in contiguous memory locations, while a linked list stores its elements in non-contiguous memory locations. This means that accessing
an element in an ArrayList is faster than accessing an element in a linked list, because the address of the element can be calculated directly. However, inserting or deleting an element in a
linked list is faster than inserting or deleting an element in an ArrayList, because the elements in a linked list do not need to be moved when an element is inserted or deleted.

***What are the Big(O) of the Linked List Operations?***

- Access time: **O(n)**	
- Insertion time: **O(1)**	
- Deletion time: **O(n)**