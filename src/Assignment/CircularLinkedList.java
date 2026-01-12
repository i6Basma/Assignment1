package Assignment;

public class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    Node last;

    // Question 13: Insert at specific position
    public void insertAt(int data, int pos) {
        Node newNode = new Node(data);
        if (last == null) { last = newNode; last.next = last; return; }
        Node temp = last.next;
        for (int i = 0; i < pos - 1; i++) temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == last && pos != 0) last = newNode;
    }

    // Question 15: Search for element
    public boolean search(int key) {
        if (last == null) return false;
        Node temp = last.next;
        do {
            if (temp.data == key) return true;
            temp = temp.next;
        } while (temp != last.next);
        return false;
    }
}