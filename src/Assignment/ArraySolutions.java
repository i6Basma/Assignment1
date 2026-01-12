package Assignment;
import java.util.Arrays;

public class ArraySolutions {
    // Question 1: Clone an array
    public static int[] cloneArray(int[] original) {
        return original.clone();
    }

    // Question 3: Remove specific element
    public static int[] removeElement(int[] arr, int target) {
        return Arrays.stream(arr).filter(val -> val != target).toArray();
    }
}