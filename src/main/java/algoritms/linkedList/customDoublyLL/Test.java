package algoritms.linkedList.customDoublyLL;

public class Test {

    public static void main(String[] args) {


        MyDoublyLinkedList myDoublyLL = new MyDoublyLinkedList();

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);


        myDoublyLL.add(n1.value);
        myDoublyLL.add(n2.value);
        myDoublyLL.add(n3.value);
        myDoublyLL.add(n4.value);
        myDoublyLL.add(n5.value);

        System.out.println(myDoublyLL.isEmpty());

        myDoublyLL.print();

        myDoublyLL.addFirst(70);

        myDoublyLL.print();

        myDoublyLL.deleteByValue(40);

        myDoublyLL.print();

    }
}
