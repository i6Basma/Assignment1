package Assignment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Odd Questions ---");

        int[] myArr = {10, 20, 30, 40, 50};

        int[] cloned = ArraySolutions.cloneArray(myArr);
        System.out.println("Q1 - Cloned Array: " + Arrays.toString(cloned));

        int[] filtered = ArraySolutions.removeElement(myArr, 30);
        System.out.println("Q3 - Array after removing 30: " + Arrays.toString(filtered));

        SinglyLinkedList list1 = new SinglyLinkedList();
        System.out.println("Q7 - Search for element position: " + list1.search(20));

        list1.removeAt(1);
        System.out.println("Q9 - Removed element at position 1");

        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.print("Q11 - Doubly List in Reverse: ");
        dll.printReverse();
        System.out.println();

        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAt(100, 0);
        System.out.println("Q13 - Inserted 100 at position 0 in Circular List");

        boolean found = cll.search(100);
        System.out.println("Q15 - Searching for 100 in Circular List: " + found);

        System.out.println("\n--- All tests completed! ---");
    }
}