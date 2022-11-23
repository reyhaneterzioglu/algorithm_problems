package algoritms.linkedList.customSinglyLL;

public class MySinglyLinkedList {

    // methods created :
    // add(), addFirst(), isEmpty(), deleteByValue(), getKthItemFromLast(), removeKthItemFromLast(),
    // indexOf(), print()

    public Node head;
    public Node tail;
    public int size;


    public boolean isEmpty() {
        return head == null;
    }

    public void add(int value) {

        // inserting element to the last

        Node newNode = new Node(value);

        if (isEmpty()) {
            head = tail = newNode;

        } else {

            tail.next = newNode;
            tail = newNode;

        }

        size++;
    }

    public void addFirst(int value) {

        // inserting element to the beginning

        Node newNode = new Node(value);

        if (isEmpty()) {
            head = tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;

    }

    public void deleteByValue(int value) {

        // deleting the first occurrence

        if (isEmpty()) System.out.println("list is empty");

        Node current = head;
        Node prev = head;

        while (current != null) {

            if (current.value == value) { // find the match

                if (current == head) { // deleting from the beginning

                    head = current.next;
                    current.next = null;

                } else if (current == tail) { // deleting from the end

                    prev.next = null;
                    tail = prev;

                } else { // deleting from the middle

                    prev.next = current.next;
                    current.next = null;

                }
            }

            prev = current; // keeping track of the previous
            current = current.next; // iterate
        }
        size--;
    }

    public int indexOf(int value) {

        Node current = head;
        int index = 0;

        while (current != null) {

            if (current.value == value) return index;


            current = current.next;
            index++;

        }

        return -1;
    }


    public void print() {

        Node current = head;

        while (current != null) {

            if (current.next == null) {

                System.out.println(current.value + " => null");

            } else {

                System.out.print(current.value + " =>");
            }
            current = current.next;
        }

    }

    int getKthItemFromLast(int k) {

        if (k > size) return 0;

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

    void removeKthItemFromLast(int k) {

        if (k > size) return;


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

        if (k > size) return;

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
