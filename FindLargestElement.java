public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = {15, 32, 7, 89, 24};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element: " + max);
    }
}
