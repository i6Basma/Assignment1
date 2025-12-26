package Assignmet;

public class DoublyLinkedList {
    class Node {
        int data;
        Node next, prev;
        Node(int d) { data = d; }
    }
    Node head, tail;

    // Question 11: Traverse in reverse
    public void printReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}