public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 16, 20};
        int key = 12;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(key + " found in array.");
        else
            System.out.println(key + " not found.");
    }
}
