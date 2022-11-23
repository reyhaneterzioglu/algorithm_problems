package algoritms.linkedList;

import algoritms.linkedList.customSinglyLL.MySinglyLinkedList;
import algoritms.linkedList.customSinglyLL.Node;

public class KthItemFromLast extends MySinglyLinkedList {

    // get the kth element from the last in a singly linked list

    int getKthItemFromLast(int k) {

        if (k > this.size) return 0;

        Node pointer1 = head;
        Node pointer2 = head;


        for (int i = 1; i < k; i++) {

            pointer1 = pointer1.next;
        }

        while (pointer1.next != null) {

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

        }

        return pointer2.value;

    }


}
