//Given an array nums of integers, return how many of them contain an even number of digits.

public class Program1 {
    public static void main(String[] args) {
        int[] num = { 1, 324, 12334, 3643, 12, 32, 4444 };
        int ans = evenDigit(num);
        System.out.println(ans);

    }

    static int evenDigit(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toString(arr[i]);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
