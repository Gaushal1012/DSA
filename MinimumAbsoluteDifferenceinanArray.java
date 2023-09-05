import java.util.Scanner;

public class MinimumAbsoluteDifferenceinanArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        long diff = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (diff > Math.abs(arr[i] - arr[j])) {
                    diff = Math.abs(arr[i] - arr[j]);
                }
            }
        }
        System.out.println(diff);
    }
}
