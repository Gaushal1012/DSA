public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };

        // for (int i = 0; i < arr.length; i++) {
        // int start = 0;
        // int end = arr.length - 1;
        // while (start < end) {
        // int temp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = temp;
        // }
        // System.out.println(arr);
        // }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
