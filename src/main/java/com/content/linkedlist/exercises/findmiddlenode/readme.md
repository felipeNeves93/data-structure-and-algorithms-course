Implement a method called findMiddleNode that returns the middle node of the linked list.

If the list has an even number of nodes, the method should return the second middle node.


Method signature:

public Node findMiddleNode()




Example:

LinkedList myList = new LinkedList(1);
myList.append(2);
myList.append(3);
myList.append(4);
myList.append(5);
Node middleNode = myList.findMiddleNode();
System.out.println(middleNode.value); // Output: 3

myList.append(6);
middleNode = myList.findMiddleNode();
System.out.println(middleNode.value); // Output: 4


Note:

In this problem, you should use the slow and fast pointer technique (also known as Floyd's Tortoise and Hare algorithm) to find the middle element of the linked list efficiently.

The key idea is to have two pointers, one that moves twice as fast as the other. By the time the fast pointer reaches the end of the linked list, the slow pointer will be at the middle.



DO NOT use the length attribute in your solution.

