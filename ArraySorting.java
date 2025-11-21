import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 5, 1, 8, 2 };

        System.out.println("Original Array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
