import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];

            for (int j = 0; j < A.length; j++) {
                A[j] = sc.nextInt();
            }

            for (int j = 0; j < B.length; j++) {
                B[j] = sc.nextInt();
            }

            Arrays.sort(A);
            Arrays.sort(B);

            // System.out.println(Arrays.toString(A));
            // System.out.println(Arrays.toString(B));

            int temp = 0;

            for (int j = 0; j < n; j++) {
                if (A[j] + B[n - j - 1] >= k) {
                    temp++;
                }
            }

            if (temp == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
