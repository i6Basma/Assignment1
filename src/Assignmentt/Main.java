package Assignmentt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Data Structure Assignment 2 ---");

        // تجربة السؤال 1: عكس نص
        String text = "Gemini";
        System.out.println("Q1: Original: " + text + " -> Reversed: " + Assignmentt.reverseString(text));

        // تجربة السؤال 3: عكس Queue
        Queue<Integer> myQueue = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println("Q3: Before Reverse: " + myQueue);
        Assignmentt.reverseQueue(myQueue);
        System.out.println("Q3: After Reverse: " + myQueue);

        // تجربة السؤال 5: دمج صفوف مرتبة
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        System.out.println("Q5: Merged Queue: " + Assignmentt.mergeSortedQueues(q1, q2));
    }
}