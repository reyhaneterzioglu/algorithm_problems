package algoritms.linkedList.customDoublyLL;

public class MyDoublyLinkedList {

    // methods inside :
    // isEmpty(), add(), addFirst(), deleteByValue(), print()

    Node head;
    Node tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int value) {

        Node nodeToAdd = new Node(value);

        if (isEmpty()) {

            head = tail = nodeToAdd;

        } else {

            tail.next = nodeToAdd;
            nodeToAdd.prev = tail;
            tail = nodeToAdd;
        }

        size++;
    }

    public void addFirst(int value) {

        Node nodeToAdd = new Node(value);

        if (isEmpty()) {

            head = tail = nodeToAdd;

        } else {

            nodeToAdd.prev = null;
            nodeToAdd.next = head;
            head.prev = nodeToAdd;
            head = nodeToAdd;
        }

        size++;
    }

    public void deleteByValue(int value) {

        Node current = head;

        while (current != null) {

            if (current.value == value) {

                if (current == head) {

                    current.next.prev = null;
                    head = current.next;
                    current.next = null;

                } else if (current == tail) {

                    current.prev.next = null;
                    tail = current.prev;

                } else {

                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    current.next = null;

                }
            }
            current = current.next;
        }
        size--;
    }

    void print() {

        Node current = head;

        while (current != null) {

            if (current == tail) System.out.println(" <= " + current.value + " => null");
            else if (current == head) System.out.print("null <= " + current.value + " =>");
            else System.out.print(" <= " + current.value + " => ");

            current = current.next;
        }
    }

}
