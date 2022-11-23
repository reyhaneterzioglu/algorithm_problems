package algoritms.linkedList.customDoublyLL;

public class Test {

    public static void main(String[] args) {


        MyDoublyLinkedList myDoublyLL = new MyDoublyLinkedList();

        myDoublyLL.add(10);
        myDoublyLL.add(20);
        myDoublyLL.add(30);
        myDoublyLL.add(40);
        myDoublyLL.add(50);

        System.out.println(myDoublyLL.isEmpty());

        myDoublyLL.print();

        myDoublyLL.addFirst(70);

        myDoublyLL.print();

        myDoublyLL.deleteByValue(40);

        myDoublyLL.print();

    }
}
