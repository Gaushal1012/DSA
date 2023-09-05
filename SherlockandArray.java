import java.util.Scanner;

public class SherlockandArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[i] = sc.nextInt();
            }

            int k = 0;
            int leftSum = 0;
            int rightSum = 0;
            String ans = "NO";

            if (k == 0) {
                leftSum = 0;
                for (int j = k + 1; j < arr.length; j++) {
                    rightSum = rightSum + arr[j];
                }
                if (leftSum == rightSum) {
                    ans = "YES";
                    System.out.println(ans);
                    break;
                }
                k++;
                leftSum = 0;
                rightSum = 0;
            }
            if (k != 0) {
                for (int j = 0; j < k; j++) {
                    leftSum = leftSum + arr[j];
                }
                for (int j = k + 1; j < arr.length; j++) {
                    rightSum = rightSum + arr[j];
                }
                System.out.println(leftSum);
                System.out.println(rightSum);

                if (leftSum == rightSum) {
                    ans = "YES";
                    System.out.println(ans);
                    break;
                }
                k++;
                leftSum = 0;
                rightSum = 0;
            }
            System.out.println(k);
        }
    }
}
