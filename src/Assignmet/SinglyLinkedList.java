package Assignmet;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    Node head;

    // Question 5: Concatenate two linked lists
    public void concatenate(SinglyLinkedList list2) {
        if (head == null) { head = list2.head; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = list2.head;
    }

    // Question 7: Search and return position
    public int search(int key) {
        Node temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.data == key) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // Question 9: Remove at specific position
    public void removeAt(int pos) {
        if (head == null) return;
        if (pos == 0) { head = head.next; return; }
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }
}