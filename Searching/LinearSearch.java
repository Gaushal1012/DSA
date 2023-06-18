public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 23, 12, 49, 2, 98, 28, 76, 16 };
        int target = 2;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        // This line will execute if none of the return statements above have executed
        // hence the target noy found
        return -1;
    }
}
