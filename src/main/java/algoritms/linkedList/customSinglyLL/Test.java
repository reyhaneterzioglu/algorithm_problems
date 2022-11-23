package algoritms.linkedList.customSinglyLL;

public class Test {

    public static void main(String[] args) {

        MySinglyLinkedList mySinglyLL = new MySinglyLinkedList();

        System.out.println(mySinglyLL.isEmpty()); // true

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        mySinglyLL.add(node1.value);
        mySinglyLL.add(node2.value);
        mySinglyLL.add(node3.value);
        mySinglyLL.add(node4.value);
        mySinglyLL.add(node5.value);

        System.out.println(mySinglyLL.isEmpty()); // false

        mySinglyLL.print(); // 1 =>2 =>3 =>4 =>5 => null

        mySinglyLL.deleteByValue(1);

        mySinglyLL.print(); // 2 =>3 =>4 =>5 => null

        mySinglyLL.addFirst(7);

        mySinglyLL.print(); // 7 =>2 =>3 =>4 =>5 => null

        System.out.println(mySinglyLL.indexOf(7)); // 0

        System.out.println(mySinglyLL.indexOf(13)); // -1

        System.out.println(mySinglyLL.getKthItemFromLast(4)); // 2

        mySinglyLL.removeKthItemFromLast(2);

        mySinglyLL.print(); // 7 =>2 =>3 =>5 => null

    }
}
