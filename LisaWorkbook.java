import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LisaWorkbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int page = 1;
        int pc = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            pc += arr[i] / k;
            if (arr[i] % k > 0)
                pc++;
            int q = 1;
            for (int j = page; j <= pc; j++) {
                for (int m = q; m <= arr[i]; m++) {
                    if (m == j)
                        count++;
                    if (m % k == 0) {
                        q = m + 1;
                        break;
                    }
                }
            }
            page = pc + 1;
        }
        System.out.println(count);
    }
}
