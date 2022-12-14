package algoritms.linkedList;

import algoritms.linkedList.customSinglyLL.MySinglyLinkedList;
import algoritms.linkedList.customSinglyLL.Node;

import java.util.Stack;

public class PalindromeLL {

    /**
     * Write a method that accepts the head of a singly linked list as parameter, return true if it is a palindrome or false otherwise.
     * ⮚ Notes :
     * ▪ The number of nodes in the list is in the range [1, 105]
     * ▪ 0 <= Node.val <= 9
     * ⮚ Follow up: Could you write a solution that runs in O(m + n) time and use only O(1) memory?
     * Please test your solution here : https://leetcode.com/problems/palindrome-linked-list/
     * example 1 : 1->2->2->1 true
     * example 2 : 1->2 false
     */

    public static boolean isPalindrome(Node head) {

        Node curr = head;

        Stack<Integer> stack = new Stack<>();

        while (curr != null) {

            stack.push(curr.value);

            curr = curr.next;

        }

        curr = head;

        while (curr != null) {

            if (stack.pop() != curr.value) return false;

            curr = curr.next;

        }

        return true;

    }

    public static void main(String[] args) {

        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();

        mySinglyLinkedList.add(2);
        mySinglyLinkedList.add(1);
        mySinglyLinkedList.add(1);
        mySinglyLinkedList.add(2);


        System.out.println(isPalindrome(mySinglyLinkedList.head));

    }

}
