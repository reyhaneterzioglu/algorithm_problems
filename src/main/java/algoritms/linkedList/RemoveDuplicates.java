package algoritms.linkedList;

import algoritms.linkedList.customSinglyLL.MySinglyLinkedList;
import algoritms.linkedList.customSinglyLL.Node;

public class RemoveDuplicates {

    /**
     * • You're given the head of a Singly Linked List whose nodes are in sorted order with respect to their values.
     * • Write a function that returns a modified version of the Linked List that doesn't contain any nodes with
     * duplicate values.
     * • The Linked List should be modified in-place (i.e., you shouldn't create a brand-new list), and the modified
     * Linked List should still have its nodes sorted with respect to their values.
     * • Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to
     * None / null if it's the tail of the list. Example:
     * Input: linkedList=1->1->3->4->4->4->5->6->6 //the head node with value 1
     * Output: 1 -> 3 -> 4 -> 5 -> 6 // the head node with value 1
     */

    public static void removeDuplicates(Node head) {

        if (head == null || head.next == null) return;

        Node slowRunner = head;
        Node fastRunner = head;

        while (fastRunner != null) {

            if (fastRunner.value == slowRunner.value) {

                fastRunner = fastRunner.next;
                slowRunner.next = fastRunner;

            } else {

                slowRunner = slowRunner.next;
                fastRunner = fastRunner.next;

            }
        }
    }

    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);

        list.print();

        removeDuplicates(list.head);

        list.print();

    }
}
