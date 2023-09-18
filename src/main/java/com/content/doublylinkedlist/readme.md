**What is a Doubly Linked List?**

- A doubly linked list is a linked data structure in which each node contains
  a pointer to the previous node and the next node in the list. This allows for traversal of the list in both
  directions, as well as efficient insertion and deletion of nodes.


- Each node contains three fields:

    * **Data:** The data stored in the node.
    * **Next:** A pointer to the next node in the sequence.
    * **Previous:** A pointer to the previous node in the sequence.

**What are the main differences between a Linked List and a Doubly Linked List?**

* **Number of pointers:** A node in a linked list has a single pointer to the next node in the list, while a node in a
  doubly
  linked list has two pointers, one to the next node and one to the previous node.
* **Traversal direction:** A linked list can only be traversed in one direction, from the first node to the last node. A
  doubly linked list can be traversed in both directions.
* **Insertion and deletion:** Inserting and deleting nodes in a linked list can be complex, especially if the node to be
  inserted or deleted is not at the beginning or end of the list. Inserting and deleting nodes in a doubly linked list
  is
  simpler and more efficient.

**Big O notation values**

* Search:    O(n)
* Access O(n)
* Insertion at beginning or end O(1)
* Deletion at beginning or end O(1)
* Insertion or deletion at any other position O(n)