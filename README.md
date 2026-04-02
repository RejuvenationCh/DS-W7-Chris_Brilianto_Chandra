# DS-W7-Chris_Brilianto_Chandra

1. Why does a linked list need a head variable?

2. Why does each node store a next reference?

3. Why is insertion at the beginning easier in linked list than in array?

4. In insertAtBeginning(), why do we write:
    newNode.next = head;
    head = newNode;
in that order?

5. In display(), what would happen if we accidentally wrote:
    while (current.next != null)
    instead of:

while (current != null)
