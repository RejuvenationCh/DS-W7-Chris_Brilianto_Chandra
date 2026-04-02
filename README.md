# DS-W7-Chris_Brilianto_Chandra
1. Why does a linked list need a head variable?
* The head variable acts as the main pointer for the program. It will points to the very first node and goes to the next node by checking its head and it will be the pointer pointing to the very first node

2. Why does each node store a next reference?
* Because its the only thing allowing it to travel, without next the main function will assume they are the last node and end. Next also allows linkedlist to be more modular, as if you need to add new data you just need to modify this part

3. Why is insertion at the beginning easier in linked list than in array?
* Because in linkledlist, you just need to add a new node and reroute the old node, meanwhile in an array you need to push the entire array to add the data. Chad linkedlist just need reorouting

4. In insertAtBeginning(), why do we write:
    newNode.next = head;
    head = newNode;
in that order?
* When newNode.next is triggerred, the head will point to the first node (as i answered in number 1 where head acts as the first node) and that line will points the newNode to what used to be the old first node and after that the second line is just used for the routing

5. In display(), what would happen if we accidentally wrote:
    while (current.next != null)
    instead of:
while (current != null)
* This makes the logic sees the number after the current number, which mean in an list (for ex consisting of 10, 20 30) the number 30 will not be displayed, as the code will check the next number after 30 and that will result in a null and not printing

6. Which structure is better for fast random access?
* Arrays, they have their own pointers because its always contiguous and will not really change much in structure. Linkedlist tho will require checking every single pointers first

7. Which structure is better for frequent insertion at the beginning?
* Linklist, it just needs like 2 step for insertion via rerouting

8. Why does linked list use more memory than array?
* Because its more complex, linkedlist sacrifice speed for modularity which allows easy taking, removing, or modifying the data inside, whereas array stores all that data and give them pointers by default, but its harder to modify the data inside
