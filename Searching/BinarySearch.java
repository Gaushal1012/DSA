public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { -8, -4, -1, 0, 2, 3, 4, 45, 56 };
        int target = 2;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }

    // Return the index
    // Return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle element
            // int mid = (start + end)/2; might be possible that (start+end) exceeds the
            // range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
