**What is a Doubly Linked List?**

- A doubly linked list is a linked data structure in which each node contains
  a pointer to the previous node and the next node in the list. This allows for traversal of the list in both
  directions, as well as efficient insertion and deletion of nodes.


- Each node contains three fields:

    * **Data:** The data stored in the node.
    * **Next:** A pointer to the next node in the sequence.
    * **Previous:** A pointer to the previous node in the sequence.

**Big O notation values**

* Search:    O(n)
* Access O(n)
* Insertion at beginning or end O(1)
* Deletion at beginning or end O(1)
* Insertion or deletion at any other position O(n)