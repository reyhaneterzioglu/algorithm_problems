package algoritms.linkedList;

import algoritms.linkedList.customSinglyLL.MySinglyLinkedList;
import algoritms.linkedList.customSinglyLL.Node;

public class RemoveKthItemFromLast extends MySinglyLinkedList {

    // remove the kth element from the last in a singly linked list

    void removeKthItemFromLast(int k) {

        Node pointer1 = head;
        Node pointer2 = head;
        Node prev = head;


        for (int i = 1; i < k; i++) {

            pointer1 = pointer1.next;
        }

        while (pointer1.next != null) {

            pointer1 = pointer1.next;
            prev = pointer2;
            pointer2 = pointer2.next;

        }

        // pointer2 is the kth item from last at this point

        // deletion

        if (pointer2 == head) {

            head = pointer2.next;
            pointer2.next = null;

        } else if (pointer2 == tail) {

            tail = prev;
            prev.next = null;

        } else {

            prev.next = pointer2.next;
            pointer2.next = null;

        }

        size++;
    }

    void removeKthItemFromLast2(int k) {

        Node pointer1 = head;
        Node pointer2 = head;


        for (int i = 1; i < k; i++) {

            pointer1 = pointer1.next;
        }

        while (pointer1.next != null) {

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

        }

        deleteByValue(pointer2.value);

    }
}
