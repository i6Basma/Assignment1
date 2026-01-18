package Assignmentt;

import java.util.*;

public class Assignmentt {

    // --- Question 1: Write a function to reverse a string using Stack ---
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    // --- Question 2: Write a function to sort a stack using only another Stack ---
    public static void sortStack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<>();
        while (!input.isEmpty()) {
            int tmp = input.pop();
            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        while (!tmpStack.isEmpty()) {
            input.push(tmpStack.pop());
        }
    }

    // --- Question 3: Write a function to reverse the order of elements in a queue ---
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // --- Question 4: Implement a priority queue where the smallest element is dequeue first ---
    public static PriorityQueue<Integer> createMinPriorityQueue() {
        // Java's PriorityQueue is a Min-Priority Queue by default.
        return new PriorityQueue<>();
    }

    // --- Question 5: Write a function to merge two sorted queues into a single sorted queue ---
    public static Queue<Integer> mergeSortedQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                merged.add(q1.poll());
            } else {
                merged.add(q2.poll());
            }
        }
        while (!q1.isEmpty()) merged.add(q1.poll());
        while (!q2.isEmpty()) merged.add(q2.poll());
        return merged;
    }
}