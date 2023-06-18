import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 6, 8 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // For each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // If you did not swap for a prticular value of i , it means is sorted hence
            // stop the program
            if (swapped == false) {
                break;
            }
        }
    }
}
