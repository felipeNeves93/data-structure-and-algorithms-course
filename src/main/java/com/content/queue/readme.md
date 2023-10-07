**What is a Queue?**

A queue is a linear data structure that follows a first-in-first-out (FIFO) policy. Elements are added to the queue at
the back and removed from the queue at the front. Queues are implemented as data structures coupled with access
routines, as an abstract data structure or in object-oriented languages as classes.

**Main Operations for a Queue**

* **Enqueue: O(1) -** Adding an element to the end of the queue is a constant time operation, regardless of the size of
  the queue.
* **Dequeue: O(1) -** Removing an element from the front of the queue is also a constant time operation, regardless of
  the size of the queue.
* **Peek: O(1) -** Returning the element at the front of the queue is a constant time operation.
* **IsEmpty: O(1) -** Checking if the queue is empty is a constant time operation.
* **Size: O(1) -** Getting the size of the queue is a constant time operation.

These Big O notations are for the average case. In the worst case, some operations may take longer, such as
when the queue is full or empty. However, the average case is the most important to consider when evaluating the
performance of a queue.

**Real-world examples of queues:**

* A line of people waiting to buy tickets.
* A queue of print jobs waiting to be printed.
* A queue of network packets waiting to be transmitted.
* A queue of songs waiting to be played in a music player.

Queues are a very versatile data structure and are used in many different types of software applications.