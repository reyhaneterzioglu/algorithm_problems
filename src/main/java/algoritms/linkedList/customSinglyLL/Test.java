package algoritms.linkedList.customSinglyLL;

public class Test {

    public static void main(String[] args) {

        MySinglyLinkedList mySinglyLL = new MySinglyLinkedList();

        System.out.println(mySinglyLL.isEmpty()); // true

        mySinglyLL.add(1);
        mySinglyLL.add(2);
        mySinglyLL.add(3);
        mySinglyLL.add(4);
        mySinglyLL.add(5);

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
